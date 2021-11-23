#NEG, POSITIVE ZERO,

num=int(input("enter the number: "))
pos=0
neg=0
z=0

while(num!=-1):

    if(num<0): 
        print("The number is negotive.")
        neg+=1 
        print("(Negative, Positive, zero):",neg, ",",pos,",",z)

    elif(num>0): 
        print("The number is positive.") 
        pos+=1
        print("(Negative, Positive, zero):",neg,", ",pos,",",z)

    else:
        print("The number is zero.") 
        z+=1
        print("(Negative, Positive, zero):",neg, ",",pos, ",",z)
    num=int(input("enter the number: "))