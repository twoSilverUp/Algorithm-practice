def confetti(paper):
    global blue
    isConfetti = True
    
    for p in paper:
        if p.count(0)!=0:
            isConfetti = False

    if(isConfetti and len(paper)>0):
        blue+=1
    elif(len(paper)>1):
        confetti([row[:len(paper)//2] for row in paper[:len(paper)//2]] )
        confetti([row[:len(paper)//2] for row in paper[len(paper)//2:]] )
        confetti([row[len(paper)//2:] for row in paper[:len(paper)//2]] )
        confetti([row[len(paper)//2:] for row in paper[len(paper)//2:]] )

def notConfetti(paper):
    global white
    isntConfetti = True
    
    for p in paper:
        if p.count(1)!=0:
            isntConfetti = False

    if(isntConfetti and len(paper)>0):
        white+=1
    elif(len(paper)>1):
        notConfetti([row[:len(paper)//2] for row in paper[:len(paper)//2]] )
        notConfetti([row[:len(paper)//2] for row in paper[len(paper)//2:]] )
        notConfetti([row[len(paper)//2:] for row in paper[:len(paper)//2]] )
        notConfetti([row[len(paper)//2:] for row in paper[len(paper)//2:]] )

n = int(input())
paper = []
blue = white = 0

for _ in range(n):
    paper.append(list(map(int, input().split())))

confetti(paper)
notConfetti(paper)
print(white)
print(blue)