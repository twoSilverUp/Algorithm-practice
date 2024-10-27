k = int(input())
moneys = []

for _ in range(k):
    n = int(input())
    if(n==0):
        moneys.pop()
    else:
        moneys.append(n)
    
print(sum(moneys))