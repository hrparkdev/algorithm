n = int(input())
a = list(map(int, input().split()))
min_value = a[0]
for num in a[1:]:
    if min_value > num:
        min_value = num
print(min_value)