from collections import deque
n, m = map(int, input().split())

answer = []
students = deque(list(range(1, n + 1)))

cnt = 0
while students:
    cnt += 1
    tmp = students.popleft()

    if cnt == m:
        answer.append(tmp)
        cnt = 0
    else:
        students.append(tmp)

print("<" + ", ".join(map(str, answer)) + ">")