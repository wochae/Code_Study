const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

const N = parseInt(input[0]);
const ropes = input.slice(1).map(Number);

ropes.sort((a, b) => b - a); //내림차순
let maxWeight = 0;

for (let i = 0; i < N; i++) {
  let weight = ropes[i] * (i + 1);
  maxWeight = Math.max(maxWeight, weight);
}

console.log(maxWeight);
