n = int(input())
m = 0
start = max(1, n - len(str(n)) * 9)
for i in range(start, n):
    arr_sum = sum(int(d) for d in str(i))
    if n == i + arr_sum:
        m = i
        break

print(m)