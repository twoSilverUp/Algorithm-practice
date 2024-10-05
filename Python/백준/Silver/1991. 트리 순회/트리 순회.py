# node class 정의
class Node:
    # 사실상 자식 없어도 자식 이름 '.'으로 들어와서 기본값 설정 안 해도 됨
    # 자식들 링크가 아닌 이름 저장 (딕셔너리로 찾아다닐 거라 이렇게 설정)
    def __init__(self, name, left=None, right=None):
        self.name = name
        self.left = left
        self.right = right

# 함수들은 각각 루트노드의 이름, 노드 정보 담긴 딕셔너리를 매개변수로 받음
# 전위 순회 함수
def preorder(nodeName, nodeDict):
    if(nodeName == '.'):
        return
    print(nodeName, end='')
    preorder(nodeDict[nodeName].left, nodeDict)
    preorder(nodeDict[nodeName].right, nodeDict)

# 중위 순회 함수
def inorder(nodeName, nodeDict):
    if(nodeName == '.'):
        return
    inorder(nodeDict[nodeName].left, nodeDict)
    print(nodeName, end='')
    inorder(nodeDict[nodeName].right, nodeDict)

# 후위 순회 함수
def postorder(nodeName, nodeDict):
    if(nodeName == '.'):
        return
    postorder(nodeDict[nodeName].left, nodeDict)
    postorder(nodeDict[nodeName].right, nodeDict)
    print(nodeName, end='')


# 노드 개수 입력 받기
n = int(input())

# key: node's name
# value : Node 객체
# 위의 구성을 가지는 딕셔너리 생성
nodeDict = dict()
for _ in range(n):
    names = input().split()
    # 노드가 존재하지 않는 경우
    if(nodeDict.get(names[0]) is None):
        # 노드를 생성하고 저장하도록 함
        nodeDict[names[0]] = Node(names[0], names[1], names[2])

# 함수 사용하여 탐색 진행
preorder('A', nodeDict)
print()
inorder('A', nodeDict)
print()
postorder('A', nodeDict)


    