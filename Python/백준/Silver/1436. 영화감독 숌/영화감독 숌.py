n = int(input())
nums = []
start = 666
while(True):
    if len(nums)==n:
        break
    if(str(start).find('666')!=-1):
        nums.append(start)
    start+=1

nums.sort()

print(nums[n-1])