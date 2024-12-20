n = int(input())
card_list = list(map(int, input().split()))
cards = {}

for card in card_list:
    cards[card] = True

m = int(input())
check = list(map(int, input().split()))

for ch in check:
    try:
        cards[ch]
        print(1, end=" ")
    except:
        print(0, end=" ")