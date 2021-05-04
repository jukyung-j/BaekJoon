n = int(input())
vector = input().split()

x, y = 1,1
types = ['L', 'R', 'U', 'D']
dx = [0,0,-1,1]
dy = [-1,1,0,0]

for v in vector:
    for i in range(len(types)):
        if v == types[i]:
            tx = x+dx[i]
            ty = y+dy[i]
            break
    if tx<1 or tx>n or ty<1 or ty>n:
            continue
    x = tx
    y = ty

print(x, y)

