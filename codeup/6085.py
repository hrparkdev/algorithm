w, h, b = map(int, input().split())
result = round(((w * h * b) / 8 / 1024 / 1024), 2)
print(f"{result:.2f} MB")