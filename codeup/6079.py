end = int(input())
n = 1
result = 0
while True:
    result += n
    if result >= end:
        break
    n += 1
print(n)