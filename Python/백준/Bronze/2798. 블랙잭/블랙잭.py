n, m = map(int, input().split())
cards = list(map(int, input().split()))
good = -1

for i in range(n):
    for j in range(n):
        for k in range(n):
            if (i!=j) and (i!=k) and (j!=k) and (cards[i]+cards[j]+cards[k]<=m) and (cards[i]+cards[j]+cards[k]>good):
                good = cards[i]+cards[j]+cards[k]

print(good)