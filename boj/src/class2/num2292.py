n = int(input())
step = 1
max_num = 1
while n > max_num:
    max_num += 6 * step
    step += 1
print(step)