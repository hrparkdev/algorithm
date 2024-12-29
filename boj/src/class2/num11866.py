import collections

n, k = map(int, input().split())
result = []
dequeue = collections.deque(range(1, n + 1)) # deque([1, 2, 3, 4, 5, 6, 7])

while dequeue:
    dequeue.rotate(-k + 1)
    result.append(dequeue.popleft())

print("<" + (", ".join(map(str, result))) + ">")