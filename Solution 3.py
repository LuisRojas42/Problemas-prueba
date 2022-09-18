a = [[3, 3, 4, 2], [4, 4], [4, 0, 3, 3], [2, 3], [3, 3, 3]]
a = [[-5, 2, 3], [0, 0], [0], [-100, 100]]
mids = []
sol = []
elem = 0

for i in a:
    sum = 0
    for j in i:
        sum = sum + j;
    mid = sum/len(i)
    
    if mid not in mids:
        mids.append(mid)
        sol.append([])

    ind = mids.index(mid)
    sol[ind].append(elem) 
    elem = elem + 1  

print(sol)