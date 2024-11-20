b1, b2 = map(bool, map(int, input().split()))
print((b1 and (not b2)) or ((not b1) and b2))