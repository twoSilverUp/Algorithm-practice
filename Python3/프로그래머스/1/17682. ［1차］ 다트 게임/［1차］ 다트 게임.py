def solution(dartResult):
    answer = 0
    eachPoints = []
    point = 0
    isBeforeC = False
    
    for i in dartResult:
        try:
            if not isBeforeC:
                point = int(str(point)+i)
            else:
                point = int(i)
                isBeforeC = False
        except:
            if i=='S':
                eachPoints.append(point)
            elif i=='D':
                eachPoints.append(point**2)
            elif i=='T':
                eachPoints.append(point**3)
            elif i=='*':
                eachPoints[-1] *= 2
                if len(eachPoints)>1:
                    eachPoints[len(eachPoints)-2] *= 2
            else:
                eachPoints[-1] = eachPoints[-1]*(-1)
                
            isBeforeC = True
            
    answer = sum(eachPoints)
    return answer