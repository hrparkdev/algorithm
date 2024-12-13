import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
data = []
for _ in range(n):
    x, y = map(int, input().rstrip().split())
    data.append((x, y))

data.sort(key=lambda x: (x[0], x[1]))
for t in data:
    print(f"{t[0]} {t[1]}\n")