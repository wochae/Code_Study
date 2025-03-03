N = int(input())

rope = [int(input()) for _ in range(N)]
rope.sort()

res = [rope[i] * (N - i) for i in range(N)]
print(max(res))