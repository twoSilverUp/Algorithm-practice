def bubble_sort(a, k):
    done = 0
    for _ in range(len(a), 1, -1):
        for i in range(len(a)-1): 
            if(a[i]>a[i+1]):
                a[i], a[i+1] = a[i+1], a[i]
                done+=1
                if(done==k):
                    for j in a:
                        print(j, end=" ")
                    return
    return print(-1)
                

n, k = map(int, input().split())
a = list(map(int, input().split()))

bubble_sort(a,k)


