n1, n2, n3 = map(int, input().split())
result = ((n1 if n1 < n2 else n2) if ((n1 if n1 < n2 else n2) < n3) else n3)
print(result)