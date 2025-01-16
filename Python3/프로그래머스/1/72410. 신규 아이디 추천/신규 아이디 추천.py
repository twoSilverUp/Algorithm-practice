import re

def solution(new_id):
    # level 1
    answer = new_id.lower()
    
    # level 2
    change = ''
    for c in answer:
        if (ord(c)<=ord('z') and ord(c)>=ord('a')) or (ord(c)>=ord('0') and ord(c)<=ord('9')) or c in ['-','_','.']:
            change += c
    answer = change
    
    # level 3
    answer = re.sub(r'\.{2,}', '.', answer)
    
    # level 4
    if len(answer)>0 and answer[-1] == '.':
        answer = answer[:len(answer)-1]
    if len(answer)>0 and answer[0] == '.':
        answer = answer[1:]
    
    # level 5
    if answer == '':
        answer = 'a'
    
    # level 6
    if len(answer)>15:
        if answer[14]=='.':
            answer = answer[:14]
        else:
            answer = answer[:15]
    
    # level 7
    if len(answer)<3:
        toAdd = answer[-1]
        while len(answer)!=3:
            answer+=toAdd
    
    return answer