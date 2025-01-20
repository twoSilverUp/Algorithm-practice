def solution(phone_book):
    length = {}
    keys = []
    
    for p in phone_book:
        try:
            length[len(p)]
            length[len(p)].add(p)
        except:
            length[len(p)] = {p}
            keys.append(len(p))
            
    keys.sort()
    for k in keys:
        origin = length[k].copy()
        toBe = len(length[k])
        for p in phone_book:
            if len(p)!=k:
                length[k].add(p if len(p)<k else p[:k])
                toBe+=1
                if toBe != len(length[k]):
                    if not p[:k] in origin:
                        length[k].add(p)
                    else:
                        return False
    return True