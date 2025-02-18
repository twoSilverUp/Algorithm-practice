def solution(answers):
    answer = []
    picks = [[1,2,3,4,5], [2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]]
    corrects = [0,0,0]
    
    for a in answers:
        for i in range(3):
            pick = picks[i].pop(0)
            if pick==a:
                corrects[i]+=1
            picks[i].append(pick)
    
    highest = max(corrects)
    for i in range(3):
        if corrects[i]==highest:
            answer.append(i+1)
            
    return answer