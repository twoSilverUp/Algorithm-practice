n, m = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort(reverse=True)

for i in range(m):
    string = input().split()
    op = num1 = num2 = -1

    if(len(string)==2):
        op, num1  = map(int, string)
    else:
        op, num1, num2 = map(int, string)

    if op == 1:
        count = 0
        for i in nums:
            if(num1<=i):
                count+=1
            else:
                break
        print(count)

    elif op == 2:
        count = 0
        for i in nums:
            if(num1<i):
                count+=1
            else:
                break
        print(count)

    else:
        count = 0
        for i in nums:
            if(num1<=i and num2>=i):
                count+=1
            elif(num1>i):
                break
        print(count)