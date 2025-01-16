def solution(board, moves):
    result = []
    count = 0
    for i in moves:
        for j in range(len(board[0])):
            if board[j][i-1]!=0:
                if len(result)>0 and result[-1]==board[j][i-1]:
                    count+=2
                    result.pop()
                else: result.append(board[j][i-1])
                
                board[j][i-1]=0
                break
    
    return count
