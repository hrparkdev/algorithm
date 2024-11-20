end = int(input())
start = 1
result = 0
while start <= end:
    if start % 2 == 0:
        result += start
    start += 1
print(result)