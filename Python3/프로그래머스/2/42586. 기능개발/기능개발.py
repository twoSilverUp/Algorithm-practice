def solution(progresses, speeds):
    answer = []
    days = []
    
    for i in range(len(progresses)):
        days.append((100-progresses[i])//speeds[i] if (100-progresses[i])%speeds[i]==0 else (100-progresses[i])//speeds[i]+1)
    
    
    limit = days[0]
    num = 1
    for d in days[1:]:
        if d<=limit:
            num+=1
        else:
            answer.append(num)
            limit = d
            num=1
    
    answer.append(num)
        
    return answer