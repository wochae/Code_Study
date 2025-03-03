#3주차 2번

n = int(input()) 

w = [int(input()) for _ in range(n)] 
w.sort() 

max_min = 0 
i = 0 

while n > 0: 
    min_ = w[i] * n  
    max_min = max(max_min, min_)  
    
    i += 1 
    n -= 1  

print(max_min)  