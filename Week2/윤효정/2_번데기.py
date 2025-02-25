n = int(input())
t = int(input())
guho = input()

bun = 0
dae = 0

person = -1

round = 0

while True :
    round += 1
    arr = []
    
    for i in range(2) :
        bun += 1
        person += 1
        arr.append(['bun',bun, person])
        
        
        dae += 1
        person += 1
        arr.append(['dae',dae, person])
        

    
    for j in range(0,(round + 1)) :
        bun += 1
        person += 1
        arr.append(['bun',bun, person])
        

    for k in range(0,(round + 1)) :
        dae += 1
        person += 1
        arr.append(['dae',dae, person])

    flag = 0
    
    if (guho == '0') and (bun >= t) :
        for m in arr :
            if (m[1] == t) and (m[0] =='bun') :
                res = m[2]
                flag = 1
                break
    elif (guho == '1') and (dae >= t) :
        for m in arr :
            if (m[1] == t) and (m[0] =='dae') :
                res = m[2]
                flag = 1
                break

    if flag == 1:
        break


print(res % n)