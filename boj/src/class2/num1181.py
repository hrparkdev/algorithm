n = int(input())
words = []
for _ in range(n):
    w = input()
    words.append(w)
words = list(set(words))
words.sort(key = lambda x: (len(x), x))
for w in words:
    print(w)