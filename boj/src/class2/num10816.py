import collections
import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
card_list = list(map(int, input().rstrip().split()))
m = int(input().rstrip())
find_list = list(map(int, input().rstrip().split()))

card_counter = collections.Counter(card_list) #Counter({10: 3, 3: 2, -10: 2, 6: 1, 2: 1, 7: 1})
print(" ".join(str(card_counter.get(num, 0)) for num in find_list))