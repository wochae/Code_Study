#3주차 3번
n = int(input())

p = list(map(int, input().split()))
p.sort()

i = 0
total_t = 0

while n > 0:
    t = p[i] * n
    total_t += t

    n -= 1
    i += 1

print(total_t)