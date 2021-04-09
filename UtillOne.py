import math

n, k = map(int, input().split())
count=0
num=0
while n>=k:
    num = n%k
    n -= num
    n //= k
    count += (1+num)

count += (n-1)

print(count)