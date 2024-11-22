d = []
for _ in range(19):
    d.append(list(map(int, input().split())))

n = int(input())
for _ in range(n):
    y, x = map(int, input().split())
    x -= 1
    y -= 1

    for i in range(19):
        if d[i][x] == 0:
            d[i][x] = 1
        else:
            d[i][x] = 0

    for j in range(19):
        if d[y][j] == 0:
            d[y][j] = 1
        else:
            d[y][j] = 0

for i in range(19):
    for j in range(19):
        print(d[i][j], end=' ')
    print()