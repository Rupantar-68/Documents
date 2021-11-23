import random
mysetx={random.randint(3,10)} 
print(mysetx)
for i in range(5):
    c=random.randint(100,200) 
    print(c)
    mysetx.add(c) 
    print(mysetx)
mysetB={random.randint(5,10)} 
print(mysetB)
for i in range(5):
    c=random.randint(200,300) 
    print(c)
    mysetB.add(c)
print(mysetB) 
c=mysetx.union(mysetB) 
print(c) 
c=mysetx.difference(mysetB) 
print(c) 
c=mysetx.intersection(mysetB) 
print(c)