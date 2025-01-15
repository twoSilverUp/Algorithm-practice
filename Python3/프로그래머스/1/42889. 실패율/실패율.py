def solution(N, stages):
    rate = []
    
    for step in range(1, N+1):
        if len(stages)==0:
            rate.append((0, step))
        else:
            count = stages.count(step)
            rate.append((count/len(stages), step))
            stages = [i for i in stages if i != step]
    
    rate.sort(key = lambda x:x[0], reverse = True)
    
    return [j for i, j in rate]