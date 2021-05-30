current = input()

X = ord(current[0])
Y = current[1]
move = [(-2,-1),(-2,1),(2,-1),(2,1),(-1,-2),(1,-2),(-1,2),(1,2)]
count = 0

for i in range(len(move)):
    if 'a' <= chr(X+move[i][0]) <= 'h' and 1 <= int(Y)+move[i][1] <=8:
        count += 1


print(count)
