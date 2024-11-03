def merge_sort(a, p, r):
    if p<r:
        q = int((p+r)/2)
        merge_sort(a, p, q)
        merge_sort(a,q+1,r)
        merge(a,p,q,r)

def merge(a, p, q, r):
    i = p
    j = q+1
    tmp = []
    while(i<=q and j<=r):
        if(a[i]<=a[j]):
            tmp.append(a[i])
            i+=1
        else:
            tmp.append(a[j])
            j+=1
    while(i<=q):
        tmp.append(a[i])
        i+=1
    while(j<=r):
        tmp.append(a[j])
        j+=1
    i=p
    global done
    for n in tmp:
        a[i]=n
        i+=1
        done.append(n)

n, k = map(int, input().split())
a = list(map(int, input().split()))
done = []

merge_sort(a, 0, len(a)-1)
print(done[k-1] if len(done)>=k else -1)
