t = int(input())
for _ in range(t):
    h, w, n = map(int, input().split()) #6층 12방 18번째 손님 -> 603호
    floor = 0
    room = 0
    if n % h == 0:
        floor = h
        room = n // h
    else:
        floor = n % h
        room = (n // h) + 1

    print(floor * 100 + room)