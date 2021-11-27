x=int(input("Enter x "))
y=int(input("Enter y "))
z=int(input("Enter z "))
if x>y and x>z:
    print(" {} is greater than {} and {}".format(x,y,z))
elif y>x and y>z:
    print(" {} is greater than {} and {}".format(y,x,z))
elif x==y==z:
    print( "x y and z are same")
else:
    print(" {} is greater than {} and {}".format(z,x,y))