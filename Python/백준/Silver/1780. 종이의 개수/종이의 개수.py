def minusOne(paper):
    global minuses, zeros, ones
    isPaper = True
    first = paper[0][0]

    for p in paper:
        if p.count(first)!=len(p):
            isPaper = False

    if(isPaper and len(paper)>0):
        if first == -1:
            minuses+=1
        elif first == 0:
            zeros+=1
        else:
            ones+=1

    elif(len(paper)>1):
        cut = len(paper)//3
        minusOne([row[:cut] for row in paper[:cut]] )
        minusOne([row[:cut] for row in paper[cut:2*cut]] )
        minusOne([row[:cut] for row in paper[2*cut:]])

        minusOne([row[cut:2*cut] for row in paper[:cut]] )
        minusOne([row[cut:2*cut] for row in paper[cut:2*cut]] )
        minusOne([row[cut:2*cut] for row in paper[2*cut:]])

        minusOne([row[2*cut:] for row in paper[2*cut:]])
        minusOne([row[2*cut:] for row in paper[cut:2*cut]])
        minusOne([row[2*cut:] for row in paper[:cut]])


n = int(input())
paper = []
zeros = ones = minuses = 0

for _ in range(n):
    paper.append(list(map(int, input().split())))

minusOne(paper)

print(minuses)
print(zeros)
print(ones)