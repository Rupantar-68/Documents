def sum_digits(n):
    
    sum = 0
    for digit in str(n): 
      sum += int(digit)      
    return sum
   
n = 12345
print ("The sum of  digits is",sum_digits(n))