import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
stack = []
result = []
current = 1
is_possible = True

for _ in range(n):
    num = int(input().rstrip())

    while current <= num:
        stack.append(current)
        result.append("+")
        current += 1

    if stack[-1] == num:
        stack.pop()
        result.append("-")
    else:
        is_possible = False
        break

if is_possible:
    print("\n".join(result))
else:
    print("NO")