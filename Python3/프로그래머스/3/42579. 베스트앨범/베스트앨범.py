'''
1. 속한 노래가 많이 재생된 장르 먼저 수록
2. 장르 내 많이 재생된 노래 먼저 수록
3. 재생 횟수 같은 경우 고유 번호가 낮은 노래 먼저 수록
'''

def solution(genres, plays):
    answer = []
    music = {}
    
    index = 0
    for genre, play in zip(genres, plays):
        try:
            music[genre]
            music[genre][0]+=play
            music[genre][1].append((play, index))
        except:
            music[genre] = [play, [(play, index)]]
        index+=1
    
    genSort = sorted(list(music.keys()), key= lambda x: music[x][0], reverse=True)
    
    for genre in genSort:
        music[genre][1].sort(key=lambda x:x[0], reverse=True)
        for _, index in music[genre][1][:2]:
            answer.append(index)
    
    return answer