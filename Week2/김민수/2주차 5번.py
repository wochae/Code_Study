#2주차 5번

from itertools import permutations

N = int(input())  
K = int(input())  
cards = [input() for _ in range(N)] 

unique = set()

for perm in permutations(cards, K): 
    number = "".join(perm)  
    unique.add(number)  

print(len(unique))