import sys

input = sys.stdin.readline
print = sys.stdout.write

n, m = map(int, input().rstrip().split())
board = [input().rstrip() for _ in range(n)]

def count_paint(x, y):
    draw1 = 0
    draw2 = 0
    for i in range(x, x + 8):
        for j in range(y, y + 8):
            if (i + j) % 2 == 0:
                if board[i][j] != 'B':
                    draw1 += 1
                if board[i][j] != 'W':
                    draw2 += 1
            else:
                if board[i][j] != 'W':
                    draw1 += 1
                if board[i][j] != 'B':
                    draw2 += 1
    return min(draw1, draw2)

min_result = count_paint(0, 0)

for i in range(n - 7):
    for j in range(m - 7):
        min_result = min(min_result, count_paint(i, j))

print(str(min_result))