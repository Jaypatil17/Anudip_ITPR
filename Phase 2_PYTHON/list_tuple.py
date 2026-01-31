# task 1: get movie nm from user and store in list

list=[]
list.append(input("Enter your  fav movies :"))
list.append(input("Enter your fav movies :"))
list.append(input("Enter your  fav movies :"))
print("movies are :",list)

# task 2 : check the list is palindrome or not

#list=["racecar"]
list=[]
list.append(input("Enter list :"))
# list.append(input("Enter list :"))
# list.append(input("Enter list :"))
cpy=list.copy()
cpy.reverse()
if(cpy == list):
    print("list are palindrome")
else:
    print("list are not palindrome")


#********************************************************************************************


# tuple count of occurance and sort ase and dese

grade=('c','d','a','a','b','b','a')
print(grade.count('a'))
grade.sort()
print("Sorted list :",grade)
grade.sort(reverse=True)
print("Rev-Sorted list :",grade)