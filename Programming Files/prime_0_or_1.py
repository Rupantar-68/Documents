def test_prime(n):
    if (n==1):
        return 0
    elif (n==2):
        return 1;
    else:
        for x in range(2,n):
            if(n % x==0):
                return 0
        return 1    
#here 1 means the condition is true and 0 means false
print("The given number is (Prime/ Not Prime)=(1/0) ::  ",test_prime(9))