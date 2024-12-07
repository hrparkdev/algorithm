n = int(input())
factorial_value = 1
for i in range(n, 0, -1):
    factorial_value *= i

count = 0
factorial_str = str(factorial_value)
for i in range(len(factorial_str) - 1, -1, -1):
    if factorial_str[i] != '0':
        break
    count += 1
print(count)