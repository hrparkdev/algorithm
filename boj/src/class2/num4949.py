import sys

input = sys.stdin.readline
print = sys.stdout.write

table = {")": "(", "]": "["}
while True:
    s = input().rstrip()
    if s == ".":
        break

    stack = []
    is_valid = True

    for char in s:
        if char in "([":
            stack.append(char)
        elif char in ")]":
            if not stack or table[char] != stack[-1]:
                is_valid = False
                break
            elif stack and table[char] == stack[-1]:
                stack.pop()

    if stack or not is_valid:
        print("no\n")
    else:
        print("yes\n")