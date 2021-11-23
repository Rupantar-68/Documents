num1 = input("Input the first number")
num2 = input("Input the second number")
num3 = input("Input the third number") 

if (num1 >= num2) and (num1 >= num3):
   largest = num1
elif (num2 >= num1) and (num2 >= num3):
   largest = num2
else:
   largest = num3

print("The greatest number is", largest) 