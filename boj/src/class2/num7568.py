n = int(input())
data = [tuple(map(int, input().split())) for _ in range(n)]
rank = []

for i in range(n):
    count = 1
    for j in range(n):
        if i != j and data[i][0] < data[j][0] and data[i][1] < data[j][1]:
            count += 1
    rank.append(count)

for num in rank:
    print(num, end = ' ')