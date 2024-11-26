n = int(input())
sizes = list(map(int, input().split()))
t, p = map(int, input().split())

t_bundle = 0
for size in sizes:
    if size % t == 0:
        t_bundle += size // t
    else:
        t_bundle += size // t + 1

pencils = n // p
piece = n % p

print(t_bundle)
print(pencils, piece)