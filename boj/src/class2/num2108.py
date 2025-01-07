import collections
import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input().rstrip())
nums = [int(input().rstrip()) for _ in range(n)]

#산술평균
mean = round(sum(nums) / n)

#중앙값
nums.sort()
median = nums[len(nums) // 2]

#최빈값
modes = collections.Counter(nums).most_common()
max_frequency = modes[0][1]
mode_candidates = [num for num, freq in modes if freq == max_frequency]
mode = mode_candidates[0] if len(mode_candidates) == 1 else mode_candidates[1]

#범위
range = max(nums) - min(nums)

print(f"{mean}\n")
print(f"{median}\n")
print(f"{mode}\n")
print(f"{range}\n")