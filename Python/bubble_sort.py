
# Bubble Sort

a=[9,5,7,4,2,6,1]
for i in range(0,len(a)):
    for j in range(0,len(a)-i-1):
        if a[j]>a[j+1]:
            a[j],a[j+1]=a[j+1],a[j]
        #print(a)
print(a)

# Time Complexity: O(n^2)
