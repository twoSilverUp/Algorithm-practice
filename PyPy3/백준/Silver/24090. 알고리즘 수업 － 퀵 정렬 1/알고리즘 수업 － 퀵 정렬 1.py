import sys
sys.setrecursionlimit(10**4)

def quick_sort(a, p, r):
    if(p<r):
        q = partition(a,p,r)
        if(k==count):
            return
        quick_sort(a,p,q-1)
        quick_sort(a,q+1,r)

def partition(a,p,r):
    x = a[r]
    i = p-1
    global count
    for j in range(p,r):
        if(a[j]<=x):
            i+=1
            a[i], a[j] = a[j], a[i]
            count+=1
            if(count==k):
                print(a[i], a[j])
                return

    if(i+1 != r):
        a[i+1], a[r] = a[r], a[i+1]
        count+=1
        if(count==k):
            print(a[i+1], a[r])
            return
    
    return i+1

n, k = map(int, input().split())
a = list(map(int, input().split()))
count = 0

quick_sort(a,0,n-1)
if(count<k):
    print(-1)