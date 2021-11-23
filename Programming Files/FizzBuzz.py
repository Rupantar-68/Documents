a = int (input("Enter the range starting from 1 upto "))  
print ("Displaying FizzBuzz series From 1 - ",a)  
for n in range(1,a+1):
        if n % 3 == 0 and n % 5 == 0:
            print (str(n) + " = FizzBuzz")
        elif n % 3 == 0:
            print (str(n) + " = Fizz")
        elif n % 5 == 0:
            print (str(n) + " = Buzz")
        else:
            print (str(n))
