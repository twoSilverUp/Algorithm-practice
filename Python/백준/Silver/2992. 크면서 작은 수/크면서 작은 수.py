from itertools import permutations

x = int(input())
nums = [i for i in str(x)]
permutation = list(permutations(nums, len(nums)))
result = 1000000

for p in permutation:
    num = ''
    for n in p:
        num+=n

    num = int(num)
    if(num>x and num<result):
        result = num

if result == 1000000:
    print(0)
else:
    print(result)