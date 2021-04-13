num = input()
n=[]
result=0
for char in list(num):
    n.append(int(char))

result = n[0]
for i in range(1,len(n)):
    if result<=1 or i<=1:
        result += n[i]
    else:
        result *= n[i]

print(result)