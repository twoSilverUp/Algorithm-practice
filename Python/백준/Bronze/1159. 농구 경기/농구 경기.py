n = int(input())
num = {}
possible = []

for _ in range(n):
    name = input()
    try:
        num[name[0]] += 1
        if(num[name[0]]==5):
            possible.append(name[0])
    except:
        num[name[0]] = 1

if len(possible)==0:
    print("PREDAJA")
else:
    possible.sort()
    for c in possible:
        print(c, end="")