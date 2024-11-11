import sys
sys.setrecursionlimit(10**4)

class Node:
    def __init__(self, name, left=None, right=None):
        self.name = name
        self.left = left
        self.right = right

def postOrder(root):
    if root is None:
        return
    postOrder(root.left)
    postOrder(root.right)
    print(root.name)


nodes = {}
numbers = []
'''
while True:
    try:
        line = sys.stdin.readline()
        if not line or line=='\n':
            break
        numbers.append(int(line))
    except EOFError:
        break
'''
while True:
    try:
        numbers.append(int(input()))
    except:
        break
    
for n in numbers:
    nodes[n] = Node(n)

root = nodes[numbers[0]]
for i in numbers[1:]:
    now = root
    while(True):
        if(now.name>i and now.left is None):
            now.left = nodes[i]
            break
        elif(now.name>i):
            now = now.left
        elif(now.right is None):
            now.right = nodes[i]
            break
        else:
            now = now.right

postOrder(root)  