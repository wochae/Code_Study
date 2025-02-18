## 방법 1 : 실행시간 84ms
n = int(input())

if n == 1 :
    print(1)
elif n == 2 :
    print(2)
else :
    lst = list(range(2,n+1,2))
    
    if n % 2 == 0 :
        #n이 짝수일 경우
        tmp = lst[-1] #최댓값 저장
        lst = [lst[i] for i in range(len(lst)) if i % 2 == 1]

        while len(lst) != 1 : 
            if tmp in lst : #뒤에 남은 경우
                lst = [lst[i] for i in range(len(lst)) if i % 2 == 1]
            else : #뒤에 안 남은 경우
                tmp = lst[-1] #최댓값 다시 저장
                lst = [lst[i] for i in range(len(lst)) if i % 2 == 0]  
    
    else :
        #n이 홀수일 경우
        tmp = lst[-1] #최댓값 저장
        lst = [lst[i] for i in range(len(lst)) if i % 2 == 0]

        while len(lst) != 1 :         
            if tmp in lst : #뒤에 남은 경우
                lst = [lst[i] for i in range(len(lst)) if i % 2 == 1]
            else : #뒤에 안 남은 경우
                tmp = lst[-1] #최댓값 다시 저장
                lst = [lst[i] for i in range(len(lst)) if i % 2 == 0]
            
                
    print(lst[0])
    
    
## 방법 2 : 실행 시간 164ms

from collections import deque

n = int(input())
queue = deque(range(1, n + 1))

while len(queue) > 1:
    queue.popleft()
    queue.append(queue.popleft())

print(queue[0])