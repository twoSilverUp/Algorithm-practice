from itertools import permutations as per

def solution(numbers):
    answer = 0
    candidates = []
    for i in range(1, len(numbers)+1):
        p = per(numbers, i)
        for j in p:
            candidates.append(int(''.join(map(str,j))))
    
    candidates = list(set(candidates))
    for n in candidates:
        isPrime = True
        for i in range(2,n):
            if n%i==0:
                isPrime=False
                break
        if isPrime and n!=1 and n!=0:
            answer+=1
            
    return answer
