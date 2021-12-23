import random
list1=[]
num=10
for x in range(num):
    x=random.randint(100,200)
    list1.append(x)
list1.sort()
print(list1)
