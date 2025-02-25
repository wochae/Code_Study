const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

// 입력값 처리
let [N, K_count] = input[0].split(" ").map(Number);
let K = input[1].split(" ").map(Number);

//사용할 숫자를 내림차순 정렬
K.sort((a, b) => b - a);

function findMaxNum(N, K) {
  while (N > 0) {
    // N이 0보다 크면 계속 탐색
    let str = N.toString(); // 현재 숫자를 문자열로 변환
    let isValid = true;

    // K의 숫자들만 포함하고 있는지 확인
    for (let i = 0; i < str.length; i++) {
      if (!K.includes(Number(str[i]))) {
        // N에 포함된 숫자가 K에 없으면 실패
        isValid = false;
        break;
      }
    }

    if (isValid) return N; // 가능한 경우 return

    N--; // 1씩 줄여가면서 탐색
  }

  return 0;
}

// 결과 출력
console.log(findMaxNum(N, K));
