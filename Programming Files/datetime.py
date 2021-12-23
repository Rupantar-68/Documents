import datetime

print("current date and time:",datetime.datetime.now())

print("Month of year:", datetime.date.today().strftime("%B"))

print("current year:",datetime.date.today().strftime("%Y")) 

print("Week number of the year: ", datetime.date.today().strftime("%W"))

print("Weekday of the week: ", datetime.date.today().strftime("%w"))

print("Day of year:", datetime.date.today().strftime("%j"))

print("Day of the month: ", datetime.date.today().strftime("%d"))

print("Day of week: ", datetime.date.today().strftime("%A"))