def solution(arr):
    answer = []
    answer.append(arr[0])
    
    for n in arr[1:]:
        if n!=answer[-1]:
            answer.append(n)
            
    return answer