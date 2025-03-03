const fs = require("fs");
const input = fs.readFileSync(0, "utf-8").trim().split("\n");

function coin(input) {
  //거스름돈을 5로 나누기
  let fiveCount = Math.floor(input / 5);

  while (fiveCount >= 0) {
    let remain = input - fiveCount * 5;
    //-> 남는 걸 2로 나누기가 0 -> good
    if (remain % 2 === 0) {
      let twoCount = remain / 2;
      return fiveCount + twoCount;
    }
    fiveCount--;
  }

  return -1;
}

console.log(coin(input));
