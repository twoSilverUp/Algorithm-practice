while(True):
    string = input()
    if string=='.':
        break

    stack = []
    done = True
    for c in string:
        if c=='(' or c=='{' or c=='[':
            stack.append(c)
        elif c==')' or c=='}' or c==']':
            if(len(stack)==0): 
                print('no')
                done = False
                break
            
            left = stack.pop()
            if ((c==')' and left !='(') or (c=='}' and left !='{') or (c==']' and left!='[')):
                print('no')
                done=False
                break
    if done and len(stack)==0:
        print('yes')
    elif done:
        print('no')