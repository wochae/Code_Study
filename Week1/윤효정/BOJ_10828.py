import sys

def push_x(x) :
    global queue
    queue.append(x)
    
def pop_x() :
    global queue
    if len(queue) == 0 :
        print(-1)
    else :
        print(queue[-1])
        queue = queue[:-1]
        
def size() :
    print(len(queue))
    
def empty() :
    if len(queue) == 0 :
        print(1)
    else :
        print(0)

def top() :
    if len(queue) == 0 :
        print(-1)
    else :
        print(queue[-1])

global queue
queue = []
inputs = sys.stdin.read
commands = inputs().split("\n")

tmp = int(commands[0])
for i in range(1,tmp+1) :
    origin = commands[i].split()
    
    if origin[0] == 'push' :
        push_x(int(origin[1]))
    elif origin[0] == 'pop' :
        pop_x()
    elif origin[0] == 'size' :
        size()
    elif origin[0] == 'empty' :
        empty()
    elif origin[0] == 'top' :
        top()