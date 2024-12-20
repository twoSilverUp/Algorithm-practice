n, m = map(int, input().split())
A = []

for i in range(n):
    A.append(list(map(int, input().split())))

m, k = map(int, input().split())
B = []

for i in range(m):
    B.append(list(map(int, input().split())))

C = []
for i in range(n):
    C.append([])
    for j in range(k):
        c = 0
        for p in range(m):
            c+=A[i][p]*B[p][j]
        C[i].append(c)

for c in C:
    for n in c:
        print(n, end=" ")
    print()
