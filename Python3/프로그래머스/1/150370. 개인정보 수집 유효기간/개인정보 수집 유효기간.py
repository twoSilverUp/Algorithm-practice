def solution(today, terms, privacies):
    answer = []
    year, month, day = map(int, today.split('.'))
    
    expiration = {}
    for t in terms:
        name, term = t.split()
        expiration[name] = int(term)
    
    num = 1
    for p in privacies:
        date, name = p.split()
        term = expiration[name]
        y, m, d = map(int, date.split('.'))
        d-=1
        if d==0:
            d=28
            m-=1
            if m==0:
                y-=1
                m==12
                
        m += term
        while m>12:
            m-=12
            y+=1
        
        if y<year:
            answer.append(num)
        elif y==year:
            if m<month:
                answer.append(num)
            elif m==month and d<day:
                answer.append(num)
        num+=1
        
    return answer