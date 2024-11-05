def solution(s):
    answer = 0
    start = 0
    
    while(True):
        answer+=1
        string = s[start:]
        same = diff = 0
        for c in string:
            start+=1
            if(c == string[0]):
                same+=1
            else:
                diff+=1
            if(same==diff): 
                break
        
        if(start == len(s)):
            break
        
        
    return answer