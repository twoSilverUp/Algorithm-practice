def solution(triangle):
    findMax = triangle.copy()
    findMax[1][0] += findMax[0][0]
    findMax[1][1] += findMax[0][0]
    
    for i in range(2,len(triangle)):
        findMax[i][0]+=findMax[i-1][0]
        findMax[i][len(findMax[i])-1]+=findMax[i-1][len(findMax[i])-2]
        for j in range(1,len(triangle[i])-1):
            findMax[i][j] += max([findMax[i-1][j-1], findMax[i-1][j]])
    
    return max(findMax[len(findMax)-1])