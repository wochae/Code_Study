const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

// 입력값 처리
const A = parseInt(input[0]); // 게임에 참여하는 사람 수
const T = parseInt(input[1]); // 구하고자 하는 번째 구호
const call = parseInt(input[2]); // 뻔 : 0, 데기 : 1

function find(A, T, call) {
  let count = 0; // 찾고자 하는 구호의 등장 횟수
  let person = 0; // 현재 말하는 사람 (0번부터 시작)
  let round = 1; // 몇 번째 게임 회차인지

  while (true) {
    //기본 패턴
    let pattern = [0, 1, 0, 1];

    //뻔(n번)-데기(n번)
    for (let i = 0; i < round + 1; i++) pattern.push(0);
    for (let i = 0; i < round + 1; i++) pattern.push(1);

    //T번째 call 찾기
    for (let i = 0; i < pattern.length; i++) {
      if (pattern[i] === call) {
        count++; // 해당 구호 등장 횟수 증가
        if (count === T) return person; // T번째 구호를 찾으면 해당 사람 번호 반환
      }
      //사람 번호를 원형으로 이동
      person = (person + 1) % A;
    }

    round++; // 다음 회차로 진행
  }
}
console.log(find(A, T, call));
