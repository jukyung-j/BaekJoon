n, m, k = map(int,input().split())
list = list(map(int,input().split()))
temp = k
list.sort()
number = 0
for i in range(m):
    if k!=0:
        number += list[n-1]
        k-=1
    else:
        k = temp
        number += list[n-2]

print(number)