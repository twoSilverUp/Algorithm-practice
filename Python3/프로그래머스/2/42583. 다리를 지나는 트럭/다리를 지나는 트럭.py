def solution(bridge_length, weight, truck_weights):
    answer = 1
    trucksOnBridge = [[truck_weights[0]], [1]]
    
    for truck in truck_weights[1:]:
        for i in range(len(trucksOnBridge[0])):
            trucksOnBridge[1][i]+=1
            
        if trucksOnBridge[1][0]>bridge_length:
            trucksOnBridge[0]=trucksOnBridge[0][1:]
            trucksOnBridge[1]=trucksOnBridge[1][1:]
        
        answer+=1
        
        while sum(trucksOnBridge[0])+truck>weight:
            time = bridge_length-trucksOnBridge[1][0]+1
            trucksOnBridge[0]=trucksOnBridge[0][1:]
            trucksOnBridge[1]=trucksOnBridge[1][1:]
            
            for i in range(len(trucksOnBridge[0])):
                trucksOnBridge[1][i]+=time
            
            answer+=time
        
        trucksOnBridge[0].append(truck)
        trucksOnBridge[1].append(1)
        
    answer+=(bridge_length-trucksOnBridge[1][-1]+1)
    return answer