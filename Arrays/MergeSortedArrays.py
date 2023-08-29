def ninjaAndSortedArrays(arr1,arr2,m,n):
    # Write your code here.
    p1 = 0
    p2 = 0
    tmp = []
    while(p1<m and p2<n):
        if(arr1[p1]<arr2[p2]):
            tmp.append(arr1[p1])
            p1+=1
        else:
            tmp.append(arr2[p2])
            p2+=1
    while(p1<m):
        tmp.append(arr1[p1])
        p1+=1
    while(p2<n):
        tmp.append(arr2[p2])
        p2+=1
    for i in range(n+m):
        arr1[i] = tmp[i]
    return arr1
    pass
