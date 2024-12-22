import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
n_nums = sorted(map(int, input().rstrip().split()))
m = int(input().rstrip())
m_nums = list(map(int, input().rstrip().split()))

def binary_search(arr, target):
    start = 0
    end = len(arr) - 1

    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            return True
        elif arr[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return False

for num in m_nums:
    if binary_search(n_nums, num):
        print("1\n")
    else:
        print("0\n")