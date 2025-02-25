#2주차 4번

N, M = map(int, input().split())  
DNA = [input() for _ in range(N)]  

new_DNA = ""  
HB = 0  
count = [0] * 26 

for i in range(M):
    count = [0] * 26 
     
    for j in range(N):
        char = DNA[j][i] 
        count[ord(char) - ord('A')] += 1  

    max_count = max(count)  
    best_char = chr(count.index(max_count) + ord('A'))  

    new_DNA += best_char 


for dna in DNA:
    for a, b in zip(new_DNA, dna):
        if a != b:
            HB += 1  

print(new_DNA)
print(HB)