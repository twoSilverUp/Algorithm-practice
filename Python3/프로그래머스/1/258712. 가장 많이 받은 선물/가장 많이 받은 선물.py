def solution(friends, gifts):
    answer = 0
    
    n = len(friends)
    gnt = [[0 for _ in range(n)] for _ in range(n)]
    
    for gift in gifts:
        server, receiver = map(str, gift.split())
        for s in range(n):
            for r in range(n):
                if friends[s]==server and friends[r]==receiver:
                    gnt[s][r]+=1
    
    result = [[0 for _ in range(3)] for _ in range(n)]
    for i in range(n):
        result[i][0] = sum(gnt[i])
        for j in range(n):
            result[i][1] += gnt[j][i]
        result[i][2] = result[i][0]-result[i][1]
    
    get = [0 for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if i!=j:
                if gnt[i][j]>gnt[j][i]:
                    get[i]+=1
                elif gnt[i][j]<gnt[j][i]:
                    get[j]+=1
                else:
                    if result[i][2]>result[j][2]:
                        get[i]+=1
                    elif result[i][2]<result[j][2]:
                        get[j]+=1
    answer = max(get)/2
    return answer