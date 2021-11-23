#median
x = input("Input the first number")
y = input("Input the second number")
z = input("Input the third number") 

if x>y:
    if x<z:
        median= x
    elif y>z:
        median= y
    else:
        median= z
else:
    if x>z:
        median= x
    elif y<z:
        median= y   
    else:
        median= z
print("The median is",median)