def solution(clothes):
    answer = 0
    dictionary = {}
    
    for name, typ in clothes:
        try:
            dictionary[typ]
            dictionary[typ]+=1
        except:
            dictionary[typ]=1
    
    nums = list(dictionary.values())
    
    if len(nums)>1:
        answer = nums[0]+nums[1]+nums[0]*nums[1]
        for n in nums[2:]:
            answer = n+(n+1)*answer
    else:
        return nums[0]        
    
    return answer