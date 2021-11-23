# Python program to swap two variables
 
x= int (input("Enter a value "))
y= int (input("Enter a value "))

# Using third variable
temp = x
x = y
y = temp
print("\nAfter Swapping the values are\n") 
print("Value of x:", x)
print("Value of y:", y)