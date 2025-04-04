import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    
    while scoville[0]<K:
        if len(scoville)==1:
            return -1
        elif len(scoville)==2:
            if scoville[0]+2*scoville[1]<K:
                return -1
            else:
                return answer+1
        else:
            first=heapq.heappop(scoville)
            second=heapq.heappop(scoville)
            heapq.heappush(scoville, first+2*second)
            answer+=1
        
    return answer