n = int(input())
nums = list(map(int, input().split()))
count = 0
for num in nums:
    if num <= 1:
        continue
    elif num <= 3:
        count += 1
        continue
    elif num % 2 == 0:
        continue

    is_prime = True
    for i in range(2, num):
        if num % i == 0:
            is_prime = False
            break
    if is_prime:
        count += 1

print(count)