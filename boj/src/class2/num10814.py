import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
members = []
for _ in range(n):
    age, name = input().rstrip().split()
    members.append((int(age), name))

members.sort(key=lambda x: x[0])
for age, name in members:
    print(f"{age} {name}\n")