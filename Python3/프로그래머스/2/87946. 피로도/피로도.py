from itertools import permutations as per

def solution(k, dungeons):
    answer = -1
    permutations = list(per(range(0,len(dungeons)), len(dungeons)))
    
    done = True
    for order in permutations:
        stamina = k
        possible = 0
        for idx in order:
            if stamina<dungeons[idx][0]:
                done=False
                break
            stamina-=dungeons[idx][1]
            possible+=1
        
        answer=max(possible, answer)
        
        
    return answer