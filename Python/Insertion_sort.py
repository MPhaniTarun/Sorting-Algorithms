
# Insertion Sort

a=[7,2,4,1,5,3,0]
#a=[9,8,5,4,2,1,0]
for i in range(1,len(a)):
    value=a[i]
    idx=i
    while(idx>0 and a[idx-1]>value):
        a[idx]=a[idx-1]
        idx-=1
    a[idx]=value
    #print(a)

print(a)

# Time Complexity : Avg & Worst Case ==> O(n^2)
#                   Best Case        ==> O(n)
