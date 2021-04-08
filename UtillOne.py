import math

n, k = map(int, input().split())

count = n%k

n -= count

count += int(math.log(n,k))

print(count)