h, w = map(int, input().split())
result = []
for i in range(h):
    result.append([])
    for j in range(w):
        result[i].append(0)

n = int(input())
for i in range(n):
    l, d, y, x = map(int, input().split())

    for j in range(l):
        if d == 0:
            result[y-1][x-1+j] = 1
        else:
            result[y-1+j][x-1] = 1

for i in range(h):
    for j in range(w):
        print(result[i][j], end=' ')
    print()