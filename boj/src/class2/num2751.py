import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())
nums = []
for _ in range(n):
    num = int(input().rstrip())
    nums.append(num)

nums.sort()

for num in nums:
    print(str(num) + "\n")