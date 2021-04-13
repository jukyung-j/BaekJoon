n = int(input())
x = list(map(int,input().split()))
count=0
i=0
x.sort()

while True:

    if x[i] == x[i+x[i]-1]:
        count += 1
    else :
        break
    i += x[i]
print(count)