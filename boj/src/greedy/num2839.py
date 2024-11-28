n = int(input())
count = -1
for i in range((n // 5), -1, -1):
    if (n - (5 * i)) % 3 == 0:
        count = i + (n - (5 * i)) // 3
        break
print(count)