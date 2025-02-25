const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

// 입력값 처리
const [N, M] = input[0].split(" ").map(Number);
const DNA = input.slice(1, N + 1);

//각 위치에서 가장 많이 등장한 문자 찾기
function find(DNA, M) {
  let mostDNA = "";
  let totalDistance = 0;

  for (let i = 0; i < M; i++) {
    let count = { A: 0, C: 0, G: 0, T: 0 };

    // 각 DNA에서 i번째 문자의 개수 카운트
    for (let j = 0; j < N; j++) {
      count[DNA[j][i]]++;
    }

    // 가장 많이 등장한 문자 찾기 (동점이면 사전순)
    let bestChar = "A";
    for (let char of ["A", "C", "G", "T"]) {
      if (count[char] > count[bestChar]) {
        bestChar = char;
      }
    }

    mostDNA += bestChar;
  }

  //Hamming Distance 계산
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      if (DNA[i][j] !== mostDNA[j]) {
        totalDistance++;
      }
    }
  }

  return [mostDNA, totalDistance];
}

//대표 DNA 찾기 & Hamming Distance 합 계산
const [bestDNA, minDistance] = find(DNA, M);

//결과 출력
console.log(bestDNA);
console.log(minDistance);
