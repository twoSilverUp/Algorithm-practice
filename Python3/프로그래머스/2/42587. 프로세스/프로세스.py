def solution(priorities, location):
    answer = 1
    count = {}
    keys = sorted(list(set(priorities)))
    
    for p in keys:
        count[p] = priorities.count(p)
    
    for i in range(len(priorities)):
        priorities[i] = (priorities[i],i)
    
    biggest = keys.pop()
    while True:
        priority = priorities.pop(0)
            
        if biggest==priority[0]:
            if priority[1]==location:
                return answer
            
            answer+=1
            count[biggest]-=1
            if count[biggest]==0:
                biggest=keys.pop()           
        else:
            priorities.append(priority)