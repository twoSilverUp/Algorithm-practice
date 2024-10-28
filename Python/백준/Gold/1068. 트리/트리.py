import sys
sys.setrecursionlimit(10**7)

class Node:
    def __init__(self, name, parent, childs=None):
        self.name = name
        self.parent = parent
        self.childs = childs if childs is not None else []

def numLeaf(node):
    global leafs
    if(node.name==remove):
        return
    if(len(node.childs)==0):
        leafs+=1
        return
    

    for child in node.childs:
        numLeaf(nodeDict[child])
    

n = int(input())
nodeDict ={}
parents = input().split()
remove = int(input())
root = -1
leafs = 0

for i in range(n):
    nodeDict[i] = Node(i, int(parents[i]))

for i in range(n):
    if(nodeDict[i].parent != -1 and nodeDict[i].name!=remove):
        nodeDict[nodeDict[i].parent].childs.append(i)
    elif(nodeDict[i].parent==-1):
        root = nodeDict[i]

numLeaf(root)
print(leafs)