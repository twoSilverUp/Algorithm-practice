n = int(input())
times = []

for i in range(n):
    arrive, check = map(int, input().split())
    times.append((arrive, check))

times.sort(key = lambda x:x[0])
time = 0

for t in times:
    if time<t[0]:
        time = t[0]
    
    time+=t[1]

print(time)