arr = [1, 2, 1, 2, 1]
arr = [9, 8, 7, 6, 5]

cont = 0
prev_inc = False
inc = False

for id, i in enumerate(arr):
    
    arr_aux = arr[id+1:len(arr)]
    piv = i
    st = 0

    for j in arr_aux:

        if piv < j:
            inc = True
        else:
            inc = False

        if piv != j and (st == 0 or inc != prev_inc):            
            piv = j            
            cont = cont + 1

        prev_inc = inc

print(cont)

