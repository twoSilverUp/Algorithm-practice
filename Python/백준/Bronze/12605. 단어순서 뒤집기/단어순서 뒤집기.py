n = int(input(""))

for i in range(n):
    stringList = input("").split(" ")
    print(f"Case #{i+1}:", end=" ")
    for j in range(len(stringList)-1, -1, -1):
        print(stringList[j], end=" ")
    print()
        
