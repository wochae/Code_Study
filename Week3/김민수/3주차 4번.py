#3주차 4번

N, K = map(int, input().split())
numbers = []
count = 0  
i = 0

for _ in range(N):
    numbers.append(int(input()))

numbers.sort(reverse=True)

while K > 0 and i < N:
    if numbers[i] <= K:
        count += K // numbers[i]  
        K %= numbers[i]  
    i += 1 
    
print(count)

