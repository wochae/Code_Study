# 큐

import sys
from collections import deque

n = int(sys.stdin.readline())
queue = deque([])
for i in range(n):
    c = sys.stdin.readline().split()

    if c[0] == 'push': 
        queue.append(c[1])

    elif c[0] == 'pop':   
        if len(queue) == 0:
            print(-1)
        else:
            print(queue.popleft())

    elif c[0] == 'size':  
        print(len(queue))

    elif c[0] == 'empty':
        if len(queue) == 0:
            print(1)
        else:
            print(0)

    elif c[0] == 'front':
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[0])

    elif c[0] == 'back':
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[-1])


