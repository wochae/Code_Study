#2주차 1번

from itertools import product

N, K = map(int, input().split())  
digits = list(map(int, input().split()))  

digits.sort(reverse=True)  

N = str(N)  
result = 0  

for length in range(len(N), 0, -1):  
    for num_tuple in product(digits, repeat=length):  
        num = int("".join(map(str, num_tuple)))  
        if num <= int(N):  
            result = max(result, num)  

print(result)

