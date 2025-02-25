from itertools import combinations

N, M = map(int, input().split())

ban = set()
for _ in range(M):
    a, b = map(int, input().split())
    ban.add(tuple(sorted((a, b)))) 

count = 0  

for comb in combinations(range(1, N + 1), 3):
    a, b, c = comb

    if tuple(sorted((a, b))) in ban:  
       continue 

    if tuple(sorted((b, c))) in ban:  
       continue  

    if tuple(sorted((a, c))) in ban:  
       continue  

    count += 1 

print(count)