def solution(citations):
    total = len(citations)
    citations.sort(reverse=True)
    maximum = citations[0]
    count = [0 for _ in range(maximum+1)]
    
    for i in range(total):
        now = citations[i]
        if (count[now]+1)==now:
            return now
        
        for j in range(now-1,-1,-1):
            count[j]+=1
    
    for i in range(maximum,-1,-1):
        if count[i]>=i:
            return i
            
    return 0