def solution(sizes):
    sortedVer = []
    for w,h in sizes:
        if w>h:
            sortedVer.append([w,h])
        else:
            sortedVer.append([h,w])
    
    widths = [w for w,_ in sortedVer]
    heights = [h for _,h in sortedVer]
    return max(widths)*max(heights)