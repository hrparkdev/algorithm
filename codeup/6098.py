d = []
for _ in range(10):
    d.append(list(map(int, input().split())))

y = 1
x = 1
d[y][x] = 9
while True:
    if d[y][x+1] == 0:
        x += 1
        if d[y][x] == 2:
            d[y][x] = 9
            break
        else:
            d[y][x] = 9
    elif d[y][x+1] == 1:
        y += 1
        if d[y][x] == 2:
            d[y][x] = 9
            break
        elif d[y][x] == 1:
            break
        else:
            d[y][x] = 9
    elif d[y][x+1] == 2:
        x += 1
        d[y][x] = 9
        break

for i in range(10):
    for j in range(10):
        print(d[i][j], end=' ')
    print()