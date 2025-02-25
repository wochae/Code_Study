from itertools import product

N, K = map(int,input().split())
n_long = len(str(N))

sub_lst = sorted(list(map(int,input().split())), reverse=True)
flag = 0

res = set()
for j in range(n_long, 0, -1) :
    for i in list(product(sub_lst, repeat = j)) :
        tmp = ''.join(map(str,i))
    
        if N >= int(tmp) :
            print(tmp)
            flag = 1
            break

    if flag == 1 :
        break