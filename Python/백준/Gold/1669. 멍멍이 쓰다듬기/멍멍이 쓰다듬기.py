import math

monkey, dog = map(int, input().split(" "))
diff = dog-monkey
sqrt = round(math.sqrt(diff))

if(diff==0):
  print(0)
elif(sqrt**2 >= diff):
  print(int(sqrt*2 - 1))
else:
  print(int(sqrt*2))