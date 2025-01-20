def solution(participant, completion):
    answer = ''
    c = {}
    for name in completion:
        try:
            c[name]+=1
        except:
            c[name]=1
    for name in participant:
        try:
            if c[name]==1:
                del c[name]
            else:
                c[name]-=1
        except:
            return name