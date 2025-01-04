import collections
import sys

input = sys.stdin.readline
print = sys.stdout.write

t = int(input().rstrip())
for _ in range(t):
    dequeue = collections.deque()
    n, m = map(int, input().rstrip().split())
    importance_arr = list(map(int, input().rstrip().split()))

    dequeue = collections.deque((i, importance_arr[i]) for i in range(n))

    count = 0
    while True:
        max_importance = max(dequeue, key=lambda x: x[1])[1]

        if dequeue[0][1] == max_importance:
            count += 1
            document = dequeue.popleft()
            if document[0] == m:
                print(str(count) + "\n")
                break
        else:
            dequeue.rotate(-1)