def recurrFib(n):
    global recur
    if n==1 or n==2:
        recur+=1
        return 1
    return recurrFib(n-1)+recurrFib(n-2)


n = int(input())
recur = 0

recurrFib(n)
print(recur, end=" ")
print(n-2)