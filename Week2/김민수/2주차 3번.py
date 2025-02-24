from itertools import combinations

N, M = map(int, input().split())

ban = set()
for _ in range(M):
    a, b = map(int, input().split())
    ban.add((a, b))
    ban.add((b, a))  

count = 0  

for comb in combinations(range(1, N + 1), 3):
    a, b, c = comb

    if (a, b) in ban or (b, a) in ban:  
       continue 

    if (b, c) in ban or (c, b) in ban:  
       continue  

    if (a, c) in ban or (c, a) in ban:  
       continue  

    count += 1 

print(count)