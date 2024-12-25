n, d = map(int, input().split())
shortCuts = []
for _ in range(n):
    shortCuts.append(tuple(map(int, input().split())))

dp = [i for i in range(d+1)]
shortCuts.sort(key=lambda x:x[1])

for start, end, dst in shortCuts:
    if(end>d):
        break
    if(dp[end]>dp[start]+dst):
        dp[end] = dp[start]+dst
        toAdd = 1
        for i in range(end+1,d+1):
            dp[i] = dp[end]+toAdd
            toAdd+=1

print(dp[d])
