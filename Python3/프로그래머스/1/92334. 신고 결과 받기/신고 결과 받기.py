def solution(id_list, report, k):
    answer = [0 for _ in range(len(id_list))]
    index = {}
    for i in range(len(id_list)):
        index[id_list[i]]=i
    
    
    reporter = [[False for _ in range(len(id_list))] for _ in range(len(id_list))]
    for r in report:
        rep, res = r.split()
        if not reporter[index[rep]][index[res]]:
            reporter[index[rep]][index[res]] = True
        
    for i in range(len(id_list)):
        count=0
        reported = []
        for j in range(len(id_list)):
            if reporter[j][i]:
                count+=1
                reported.append(j)
                
        if count>=k:
            for j in reported:
                answer[j]+=1
    return answer