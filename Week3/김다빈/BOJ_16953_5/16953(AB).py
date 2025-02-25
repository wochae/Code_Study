from collections import deque
a, b = map(int, input().split())


def bfs(x, target):
    queue = deque([(x, 1)])
    visited = set()

    while queue:
        popResult = queue.popleft()
        num, cnt = popResult[0], popResult[1]

        if num == target:
            return num, cnt

        addOne = int(str(num) + "1")
        multiple = num * 2
        if addOne <= target and addOne not in visited:
            queue.append((addOne, cnt + 1))
            visited.add(addOne)

        if multiple <= target and multiple not in visited:
            queue.append((num * 2, cnt + 1))
            visited.add(multiple)

    return -1, -1


num, cnt = bfs(a, b)
print(cnt if num == b else -1)
