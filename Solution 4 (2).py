def samesign(a,b):
    if a/abs(a) == b/abs(b):
        return True
    else:
        return False

def countSawSubarrays(arr):
    n = len(arr)
    
    if n<2:
        return 0

    s = 0
    e = 1
    count = 0
    
    while(e<n):
        sign = arr[e] - arr[s]
        while(e<n and arr[e] != arr[e-1] and samesign(arr[e] - arr[e-1], sign)):
            sign = -1*sign
            e+=1
        size = e-s
        if (size==1):
            e+=1
        count += (size*(size-1))//2
        s = e-1
        e = s+1
    return count

arr1 = [9,8,7,6,5]
print(countSawSubarrays(arr1))
arr2 = [1,2,1,3,4,-2]
print(countSawSubarrays(arr2))
arr3 = [1,2,1,2,1]
print(countSawSubarrays(arr3))
arr4 = [10,10,10]
print(countSawSubarrays(arr4))