#Program To find the simple interest
A = float(input('Enter the Principal Amount: '))
I = float(input('Enter Interest Percent: '))
Y = float(input('Enter Number of Years: '))
R = (I/100)
F = A*(1+(R*Y))
#here f is the final amount
print("The simple interest of the given Principal Amount",A,"at a rate of given",I,"% interest in terms of",Y,"Year(s) is",F)