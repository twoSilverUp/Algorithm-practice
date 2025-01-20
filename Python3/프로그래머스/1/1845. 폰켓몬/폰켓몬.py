def solution(nums):
    maximum = len(nums)/2
    nums = set(nums)
    
    if len(nums)>=maximum:
        return maximum
    else:
        return len(nums)