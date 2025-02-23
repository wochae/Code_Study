# (10 ≤ N ≤ 100,000,000, 1 ≤ K의 원소의 개수 ≤ 3)

n, k = map(int, input().split())
nums = list(map(int, input().split()))
answer = ""


def backtracking(curNum, numArr, targetNum):
    global answer

    if len(curNum) > 0 and int(curNum) > int(targetNum):
        return

    if len(curNum) > 0 and int(targetNum) >= int(curNum):
        if answer == "" or int(curNum) > int(answer):
            answer = curNum

    for i in numArr:
        backtracking(curNum + str(i), numArr, targetNum)


backtracking(answer, nums, str(n))
print(answer)
