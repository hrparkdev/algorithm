import sys

def push(queue, x):
    queue.append(x)

def pop(queue):
    return queue.pop(0) if queue else -1

def size(queue):
    return len(queue)

def empty(queue):
    return 1 if not queue else 0

def front(queue):
    return queue[0] if queue else -1

def back(queue):
    return queue[-1] if queue else -1

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
queue = []
output = []

for _ in range(n):
    command = input().rstrip()

    if command.startswith("push"):
        _, value = command.split()
        push(queue, int(value))
    elif command == "pop":
        output.append(pop(queue))
    elif command == "size":
        output.append(size(queue))
    elif command == "empty":
        output.append(empty(queue))
    elif command == "front":
        output.append(front(queue))
    elif command == "back":
        output.append(back(queue))

print("\n".join(map(str, output)))