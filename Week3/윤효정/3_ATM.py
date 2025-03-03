#ATM
N = int(input())
time = list(map(int,input().split()))

time.sort()

res = 0

for i in range(1,N+1) :
    tmp = time[:i]
    res += sum(tmp)

print(res)