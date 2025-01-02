n = int(input())
pairs = 0
mapping = {}

for _ in range(n):
    val, key = input().split()

    try:
        lst = mapping[val[:2]]
        for city, state in lst:
            if key==city[:2] and state!=key:
                pairs+=1
    except:
        pass

    try:
        mapping[key]
        mapping[key].append((val, key))
    except:
        mapping[key]=[(val, key)]
    


print(pairs)