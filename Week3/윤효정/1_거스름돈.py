N = int(input())

def value_check(coin, t) :
    
    rem = coin % 5 + (5 * t)
    cnt_5 = coin // 5 - t

    cnt_2 = rem // 2
    rem = rem % 2

    return rem, cnt_5, cnt_2

t = 0
while True :
    check, cnt5, cnt2 = value_check(N, t)
    
    if (check == 0) :
        print(cnt5 + cnt2)
        break
    elif cnt5 < 0 :
        print(-1)
    
    t += 1
