list1 = [1, 2, 3, 4, 5]
list2 = [6, 5, 4, 3, 3]

Result = []
for i1, i2 in zip(list1, list2):
  Result.append(i1*i2)
  
print("The product of 2 lists is: ", Result)