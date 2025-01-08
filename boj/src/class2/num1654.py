import sys

input = sys.stdin.readline
print = sys.stdout.write

k, n = map(int, input().rstrip().split())
lan_cables = [int(input().rstrip()) for _ in range(k)]

start, end = 1, max(lan_cables)
result = 0

while start <= end:
    mid = (start + end) // 2
    count = sum(cable // mid for cable in lan_cables)

    if n <= count:
        result = mid
        start = mid + 1
    else:
        end = mid - 1

print(str(result))