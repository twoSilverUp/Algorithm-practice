# kruskal 알고리즘을 사용해서 최소 비행기 수를 구해보고자 함!

# 부모 찾는 함수
def findParent(parent, node):
    if parent[node-1] != node:
        parent[node-1] = findParent(parent, parent[node-1])
    return parent[node-1]

# 두 그래프(집합) 합치는 함수
def unionParent(parent, node1, node2):
    parent1 = findParent(parent, node1)
    parent2 = findParent(parent, node2)
    if parent1 < parent2:
        parent[node2-1] = parent1
    else:
        parent[node1-1] = parent2

t = int(input())

for _ in range(t):
    n, m = map(int, input().split())
    #edge 정보 리스트 
    edges = []
    #정보 입력받기
    for _ in range(m):
        a, b = map(int, input().split())
        edges.append((a, b))
    
    #모든 노드의 부모를 자기자신으로 초기 설정
    parent = [i for i in range(1,n+1)]
    diff = n
    # 비행기 수
    flights = 0
    for edge in edges:
        a, b = edge
        if (findParent(parent, a) != findParent(parent, b)):
            unionParent(parent, a, b)
            diff-=1
            flights+=1

    print(flights + diff - 1)
