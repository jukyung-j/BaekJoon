a, b = map(int, input().split())

max = 0
for i in range(a):
    card = list(map(int,input().split()))
    card.sort()
    if max < card[0]:
        max = card[0]

print(max)