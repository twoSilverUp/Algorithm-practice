def solution(people, limit):
    from collections import deque
    answer = 0
    people.sort()
    people=deque(people)
    while people:
        largest=people.pop()
        if people and largest+people[0]<=limit:
            largest+=people.popleft()
        answer+=1
    return answer