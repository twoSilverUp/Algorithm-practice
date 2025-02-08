def solution(array, commands):
    answer = []
    array = [(array[i], i) for i in range(len(array))]
    array.sort(key=lambda x:x[0])
    
    for i, j, k in commands:
        indexing = [(num, index) for num, index in array if index>=i-1 and index<=j-1]
        answer.append(indexing[k-1][0])
        
    return answer