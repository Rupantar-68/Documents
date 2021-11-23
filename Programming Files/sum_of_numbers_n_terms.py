num = int(input("Enter a number: ")) 

if num < 0:
   print("Please enter a positive number")
else:
   sum = 0
   # use while loop to iterate until zero
   while(num > 0):
       sum += num
       num -= 1
   print("The result is", sum)