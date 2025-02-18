#요세푸스

from collections import deque

n, k = map(int, input().split())
q = deque(range(1, n + 1))
answer = []

while q:
    for _ in range(k-1):
        q.append(q.popleft())
    answer.append(q.popleft())

print(str(answer).replace('[', '<').replace(']', '>'))