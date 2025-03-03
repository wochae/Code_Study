#동전 0

N, K = map(int,input().split())
coin = [int(input()) for _ in range(N)]

coin.sort(reverse=True)

res = 0

for i in coin :
    if i > K :
        continue
    else :
        res += K // i
        K = K % i
        
    if K == 0 :
        break

print(res)  