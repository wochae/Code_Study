# 풀이 1 deque 사용
import sys
from collections import deque

def push_x(x):
    queue.append(x)

def pop_x():
    if queue:
        print(queue.popleft())
    else:
        print(-1)

def size():
    print(len(queue))

def empty():
    print(1 if not queue else 0)

def front():
    print(queue[0] if queue else -1)

def back():
    print(queue[-1] if queue else -1)

queue = deque()
input = sys.stdin.read
commands = input().split("\n")

tmp = int(commands[0])
for i in range(1, tmp + 1):
    origin = commands[i].split()
    
    if origin[0] == 'push':
        push_x(int(origin[1]))
    elif origin[0] == 'pop':
        pop_x()
    elif origin[0] == 'size':
        size()
    elif origin[0] == 'empty':
        empty()
    elif origin[0] == 'front':
        front()
    elif origin[0] == 'back':
        back()

# 풀이 2 index 사용
import sys

def push_x(x):
    queue.append(x)

def pop_x():
    global front_idx
    if front_idx == len(queue):
        print(-1)
    else:
        print(queue[front_idx])
        front_idx += 1

def size():
    print(len(queue) - front_idx)

def empty():
    print(1 if front_idx == len(queue) else 0)

def front():
    if front_idx == len(queue):
        print(-1)
    else:
        print(queue[front_idx])

def back():
    if front_idx == len(queue):
        print(-1)
    else:
        print(queue[-1])

queue = []
front_idx = 0

input = sys.stdin.read
commands = input().split("\n")

tmp = int(commands[0])
for i in range(1, tmp + 1):
    if not commands[i]:
        continue
    origin = commands[i].split()
    
    if origin[0] == 'push':
        push_x(int(origin[1]))
    elif origin[0] == 'pop':
        pop_x()
    elif origin[0] == 'size':
        size()
    elif origin[0] == 'empty':
        empty()
    elif origin[0] == 'front':
        front()
    elif origin[0] == 'back':
        back()