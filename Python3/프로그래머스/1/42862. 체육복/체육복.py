def solution(n, lost, reserve):
    reserve2 = []
    lost2 = []
    for r in reserve:
        if not r in lost:
            reserve2.append(r)
    for l in lost:
        if not l in reserve:
            lost2.append(l)
            
    reserve = sorted(reserve2)
    lost = sorted(lost2)
    answer = n-len(lost)
    
    for l in lost:
        for i in range(len(reserve)):
            if reserve[i] in [l-1, l+1]:
                answer+=1
                reserve.pop(i)
                break
            
    return answer