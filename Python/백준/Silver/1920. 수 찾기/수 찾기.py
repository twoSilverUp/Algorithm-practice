n = int(input())
ls = list(map(int, input().split()))
isIn = {}
for i in ls:
    isIn[i] = True

m = int(input())
nums = list(map(int, input().split()))

for i in nums:
    try:
        isIn[i]
        print(1)
    except:
        print(0)