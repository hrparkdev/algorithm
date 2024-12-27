import sys

def push(stack, x):
    stack.append(x)

def pop(stack):
    return stack.pop() if stack else -1

def size(stack):
    return len(stack)

def empty(stack):
    return 1 if not stack else 0

def top(stack):
    return stack[-1] if stack else -1

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
stack = []
output = []

for _ in range(n):
    command = input().rstrip()

    if command.startswith("push"):
        _, value = command.split()
        push(stack, int(value))
    elif command == "pop":
        output.append(pop(stack))
    elif command == "size":
        output.append(size(stack))
    elif command == "empty":
        output.append(empty(stack))
    elif command == "top":
        output.append(top(stack))

print("\n".join(map(str, output)))