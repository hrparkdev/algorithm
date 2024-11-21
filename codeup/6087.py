n = int(input())
total_sum = 0
for i in range(1, n + 1):
    if i % 3 == 0:
        continue
    total_sum += i
    print(i, end=' ')