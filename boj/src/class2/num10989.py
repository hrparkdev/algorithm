import sys

input = sys.stdin.readline
print = sys.stdout.write

max_value = 10000
count_arr = [0] * (max_value + 1)
n = int(input().rstrip())

for _ in range(n):
    num = int(input().rstrip())
    count_arr[num] += 1

for i in range(1, max_value + 1):
    if 0 < count_arr[i]:
        for _ in range(count_arr[i]):
            print(f"{i}\n")