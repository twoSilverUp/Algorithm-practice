n = int(input())
string = input()
h = 0

for i in range(n):
    h += (ord(string[i])-ord('a')+1)*(31**i)

print(h%1234567891)