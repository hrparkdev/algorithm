numbers = map(int, input().split())
for n in numbers:
    if n % 2 == 0:
        print("even")
    else:
        print("odd")