const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

const [A, B] = input[0].split(" ").map(Number);

function AtoB(A, B) {
  let count = 1;
  while (true) {
    if (B === A) return count;
    if (B < A) return -1; //
    if (B % 10 === 1) {
      //B 맨끝자리가 1
      B = Math.floor(B / 10);
    } else if (B % 2 === 0) {
      //B가 짝수
      B = B / 2;
    } else {
      return -1;
    }
    count++;
  }
}

console.log(AtoB(A, B));
