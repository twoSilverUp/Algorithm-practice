computer = int(input())
pair = int(input())
edges = [[-1 for _ in range(computer)] for _ in range(computer)]

for _ in range(pair):
    i, j = map(int, input().split())
    edges[i-1][j-1] = edges[j-1][i-1] = 1

visited = [False for _ in range(computer)]
queue = []

visited[0] = True
queue.append(0)
infected = 0
while len(queue)!=0:
    com = queue.pop(0)
    for c in range(computer):
        if edges[com][c] == 1 and not visited[c]:
            queue.append(c)
            visited[c] = True
            infected+=1

print(infected)