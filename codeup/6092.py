n = int(input())
a = map(int, input().split())

d = [0] * 24

for i in a:
    d[i] += 1

for i in range(1, 24):
    print(d[i], end=' ')