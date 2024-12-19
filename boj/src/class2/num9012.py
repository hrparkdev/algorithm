import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())

for _ in range(n):
    brackets = input().rstrip()
    stack = []
    is_valid = True
    for bracket in brackets:
        if bracket == "(":
            stack.append(bracket)
        elif bracket == ")":
            if not stack:
                is_valid = False
                break
            else:
                stack.pop()

    if stack or not is_valid:
        print("NO" + "\n")
    else:
        print("YES" + "\n")