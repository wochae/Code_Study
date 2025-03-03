const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

const N = parseInt(input[0]);
const times = input[1].split(" ").map(Number); //각각의 걸리는 시간
times.sort((a, b) => a - b); // 오름차순

let totalTime = 0;
let waitingTime = 0;

for (let i = 0; i < N; i++) {
  waitingTime += times[i];
  totalTime += waitingTime;
}

console.log(totalTime);
