#3주차 1번

n = int(input())

q = n // 5 # 몫
r = n % 5 # 나머지

c1 = r // 2
c2 = (n - (5 * (q -1 ))) // 2 

if n == 1 or n == 3:  
    print(-1)
else:
    if r == 0 or r % 2 == 0:  
        print(q + c1)
    else:  
        print((q - 1) + c2)
