a=[1,9,2,8,3,7,4,6,5]
item=int(input("Number?"))
x=len(a)
a.sort()
start=0
end=x-1
found=False
while item>=a[start] and item<=a[end]:
    mid=int((start+end)/2)
    if item<a[mid]:
        end=mid-1
    elif item >a[mid]:
        start=mid+1
    else:
        found=True
        break
if found:
    print("Found!")
else:
    print( "Not Found")