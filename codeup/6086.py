target_sum = int(input())
current_sum = 0
current_num = 0
while True:
    current_num += 1
    current_sum += current_num
    if target_sum <= current_sum:
        print(current_sum)
        break