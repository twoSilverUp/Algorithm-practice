a,b=map(int, input().split())

count=0
while a<b:
    if str(b)[-1]=='1':
        b=int(str(b)[:-1])
    elif b%2==0:
        b//=2
    else:
        print(-1)
        break
    count+=1

if a==b:
    print(count+1)
elif a>b:
    print(-1)