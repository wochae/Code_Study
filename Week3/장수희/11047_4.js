const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

const [N, K] = input[0].split(" ").map(Number); //N : 동전종류, K: 가치합
const coins = input.slice(1).map(Number).reverse(); // 각각의 가치 내림차순으로 두기 !!

let totalCount = 0;
let remain = K;

for (let coin of coins) {
  if (remain === 0) break;
  let count = Math.floor(remain / coin);
  totalCount += count;
  remain -= count * coin;
}

console.log(totalCount);
