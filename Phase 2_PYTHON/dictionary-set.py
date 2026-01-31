dist={
  "name":"Jayvardhan",
  "marks":
  {
    "phy":95,
    "chem":95,
    "maths":90
  }
}
print(dist.keys())#return keys of dist
print(dist.values())#return values of dist
print(dist.items())#return all dist
print(dist.get("marks"))#return values of marks
dist.update({"city":"Sangli","age":20})#add new key-val pair
print(dist)

#***********************************************************************************************

set={1,2,"sahil",3,"Aditya",4,2,"harsh",3,1,"saurabh",4}
print(set)#it returns only{1, 2, 3, 4}
print(len(set))#return length of set
set.add(5)
set.add("Pratik")
print(set)
set.remove(5)
print(set.pop())
print(set)
set.clear()
print(set)

set1={1,2,3,4}
set2={3,4,5,6}

print("union set is :",set1.union(set2))
print("intersection set is :",set1.intersection(set2))


#task 1  store data in dictionary

sample={
    "table":{"a piece of furniture","list of facts and figures"},
    "cat":" a small animal"
}

#task 2  "python","java","c++","python","javascript","java","python","java","c++","c" 
          # this are the subject now how many class room are requires

sam={"python","java","c++","python","javascript","java","python","java","c++","c"}
print("The total required class is:",len(sam))#total 5 class are required 

#task 3 whp to enter 3 sub mark form user and store in dictionary

dist={}
sub1=int(input("Enter mark of sub1 :"))
sub2=int(input("Enter mark of sub2 :"))
sub3=int(input("Enter mark of sub3 :"))
dist.update({"phy":sub1})
dist.update({"chem":sub2})
dist.update({"maths":sub3})
print(dist)

#task 4 save 9 and 9.0 in set with the hel of builting datatypes

set={("int",9),("float",9.0)}
print("set values are :",set)
