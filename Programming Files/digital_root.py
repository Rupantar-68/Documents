def digitalRoot(n):
    sum = 0
     
    while(n > 0 or sum > 9):
     
        if(n == 0):
            n = sum
            sum = 0
         
        sum += n % 10
        n /= 10
     
    return sum

n = 65785412
print ("The digital root is ",digitalRoot(n))