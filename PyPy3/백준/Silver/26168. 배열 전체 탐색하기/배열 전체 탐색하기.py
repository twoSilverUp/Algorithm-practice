import bisect

n, m = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()

for i in range(m):
    string = input().split()
    op = num1 = num2 = -1
    
    if(len(string)==2):
        op, num1  = map(int, string)
    else:
        op, num1, num2 = map(int, string)

    if op == 1:
        index = bisect.bisect_left(nums, num1)
        print(n-index)

    elif op == 2:
        index = bisect.bisect_right(nums, num1)
        print(n-index)

    else:
        left = bisect.bisect_left(nums, num1)
        right = bisect.bisect_right(nums, num2)
        print(right-left)