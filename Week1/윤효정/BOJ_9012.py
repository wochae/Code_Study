def iscnt(x) :
    left_cnt = x.count('(')
    right_cnt = x.count(')')
    
    if left_cnt == right_cnt :
        return 1
    else :
        return 0
    
def fst_left(x) :
    check = 0

    while True :
        if x.find(')') == -1 :
            print('YES')
            break

        idx = x.find(')')

        l_cnt = x[:idx].count('(')

        if l_cnt - check < 1 :
            print('NO')
            break

        x = x.replace(")",'-',1)
        check += 1

cnt = int(input())

for i in range(0,cnt) :
    val = input()
    
    res_1 = iscnt(val)
    
    if res_1 == 0 :
        print("NO")
    else :
        fst_left(val)