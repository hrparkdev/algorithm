import sys
from collections import deque

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
cards = deque(range(1, n + 1))
while len(cards) > 1:
    cards.popleft()
    cards.append(cards.popleft())

print(str(cards[0]))