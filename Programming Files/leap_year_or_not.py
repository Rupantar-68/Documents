#program to check leap year or not
year=int(input("Enter the year to be checked"))
if (year % 4) == 0 :
    print("The year is a Leap year")
else :
    print("The year is not a Leap year")