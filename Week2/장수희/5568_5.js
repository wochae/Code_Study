const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

// 입력값 처리
const n = parseInt(input[0]); // 카드 개수
const k = parseInt(input[1]); // 선택할 카드 개수
const cards = input.slice(2, 2 + n).map(String); // 숫자 카드 배열 (문자열로 저장)

// 가능한 숫자 저장
const num = new Set();
const visited = new Array(n).fill(false);

function generate(count, number) {
  if (count === k) {
    num.add(number); // 완성된 숫자를 Set에 저장
    return;
  }

  for (let i = 0; i < n; i++) {
    if (!visited[i]) {
      // 방문하지 않은 숫자만 선택
      visited[i] = true;
      generate(count + 1, number + cards[i]);
      visited[i] = false; // 백트래킹: 방문 해제
    }
  }
}

// 백트래킹
generate(0, "");

// 결과 출력 (Set 크기)
console.log(num.size);
