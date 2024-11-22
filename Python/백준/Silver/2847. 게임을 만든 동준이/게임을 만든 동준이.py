n = int(input())
levels = []

for _ in range(n):
    levels.append(int(input()))

levels.reverse()

total = 0
for i in range(1, n):
    if(levels[i-1]<=levels[i]):
        total += (levels[i]-levels[i-1]+1)
        levels[i] = levels[i-1]-1

print(total)