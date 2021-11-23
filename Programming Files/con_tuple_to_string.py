def convertTuple(tup):
	str = ''
	for item in tup:
		str = str + item
	return str

tuple = ('P', 'Y', 'T', 'H', 'O', 'N')
str = convertTuple(tuple)
print(str)