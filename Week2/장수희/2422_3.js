const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

// 입력값 처리
const [N, M] = input[0].split(" ").map(Number); // N: 아이스크림 종류, M: 금지 조합 개수
const AvoidArray = []; // 금지된 조합 저장 배열

for (let i = 1; i <= M; i++) {
  let [a, b] = input[i].split(" ").map(Number);
  AvoidArray.push([a, b]);
}

//금지된 조합을 저장할 2차원 배열 만들기
let AvoidTable = new Array(N + 1);
for (let i = 0; i <= N; i++) {
  AvoidTable[i] = new Array(N + 1).fill(false);
}

//주어진 금지된 조합 -> true
for (let i = 0; i < AvoidArray.length; i++) {
  let a = AvoidArray[i][0];
  let b = AvoidArray[i][1];

  AvoidTable[a][b] = true;
  AvoidTable[b][a] = true; //반대도
}

//가능한 조합 찾기
let count = 0;

for (let i = 1; i <= N; i++) {
  // 첫 번째 아이스크림 선택
  for (let j = i + 1; j <= N; j++) {
    // 두 번째 아이스크림 선택
    if (AvoidTable[i][j]) continue; // 금지된 조합이면 패스

    for (let k = j + 1; k <= N; k++) {
      // 세 번째 아이스크림 선택
      if (AvoidTable[i][k] || AvoidTable[j][k]) continue; // 금지된 조합이면 패스

      count++; // 가능하면 카운트 증가
    }
  }
}

//결과 출력
console.log(count);
