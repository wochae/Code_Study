#A->B
a, b = map(int,input().split())
insu = list()
res = 0

while True :
    
    if a in insu :
        print(res+1)
        break
    
    if (str(b)[-1:] == '1') and (str(b)!='1') :
        b = int(str(b)[:-1])
        insu.append(b)
        res += 1
        continue
    
    if (a > b) or (b % 2 == 1) :
        print(-1)
        break
    
    b = b // 2
    insu.append(b)
    res += 1
