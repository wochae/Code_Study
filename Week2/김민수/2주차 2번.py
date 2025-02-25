A = int(input()) 
T = int(input())  
N = int(input())  

turns = [] 
bun_count = 1 
deg_count = 1 
round_number = 1 

while True:

    for _ in range(2):
        turns.append((bun_count, 0))  # "뻔"
        bun_count += 1
        turns.append((deg_count, 1))  # "데기"
        deg_count += 1


    for _ in range(round_number + 1):
        turns.append((bun_count, 0))  # "뻔"
        bun_count += 1


    for _ in range(round_number + 1):
        turns.append((deg_count, 1))  # "데기"
        deg_count += 1

 
    if turns[-1][0] >= T:  
        for i in range(len(turns)): 
            if turns[i] == (T, N):  
                print(i % A)  
                exit()

    round_number += 1  