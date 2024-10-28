a = []
n = int(input())

for i in range(n):
  hour, min = map(int, input().split(":"))
  a.append(hour*60+min)

minimum = n

for i in range(1, 721):
  times = set()
  for j in range(n):
    times.add((a[j]-i*j)%720)
  
  if(len(times)<minimum):
    minimum = len(times)

print(minimum)