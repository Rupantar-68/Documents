terms = int(input("Enter the number of terms "))
y=int(input("Enter the number whose power is to be printed "))

result = list(map(lambda x: y ** x, range(terms)))

print("The total terms are:",terms)
for i in range(terms):
   print(y ," raised to power",i,"is",result[i])