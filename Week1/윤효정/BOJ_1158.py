n, k = map(int,input().split())
val = list(range(1,n+1))

print("<", end='')

while True :
    print(val)
    
    if len(val) == 1 :
        print(val[0], end=">")
        break
        
    if len(val) < k :
        k_p = k-len(val)
        while k_p > len(val) :
            k_p = k_p-len(val)

        print(f"{val.pop(k_p-1)}", end=', ')
        val = val[k_p-1:] + val[:k_p-1]
        continue
        
    
    print(val[k-1], end=", ")
    val = val[k:] + val[:k-1]