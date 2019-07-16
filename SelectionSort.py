def minimum(a, k, n):
    m = a[k]
    loc = k
    for j in range( k + 1, n ):
        if m > a[j]:
            m = a[j]
            loc = j
    return loc


def selection(a, n):
    for k in range( n - 1 ):
        loc = minimum( a, k, n )
        a[k], a[loc] = a[loc], a[k]


a = [2, 1, 9, 8, 4, 6, 5]
n = len( a )
selection( a, n )
print( a )
