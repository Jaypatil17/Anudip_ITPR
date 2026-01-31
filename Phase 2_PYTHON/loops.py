# # while loop
##******************************************************************************
# i=1
# while i<=5:
#     print("JP")
#     i+=1

# # task 1: print 1 to 100
# i=1
# while i<=100:
    
#     print(i)
#     i+=1

# print("\n")

# #task 2: print 100 to 1
# i=100
# while i>=1:
    
#     print(i)
#     i-=1

# #task 3:  print square of 10 numbers
# i=1
# while i<=10:
#     print(i*i)
#     i+=1
       
        #OR
# list=[1,4,8,16,25,36,49,64,81,100]
# i=0
# while i<len(list):
#     print(list[i])
#     i+=1

# #task 4: table of any number
 
# n=int(input("Enter number of getting table :"))
# i=1
# while i<=10:
#     print(n*i)
#     i+=1

# #task 5 :  searching an element

tup=(1,4,8,16,25,36,49,64,81,100)
x=int(input("Enter an number to be searched in the tuple:"))
i=0
while i<len(tup):
    if (tup[i]==x):
        print(" Entered number are present at index",i)
    i+=1

##**************************************************************************************8

## break and continue keyword

# i=1
# while i<=10:
#        if(i==5):
#          print(i)
#          break
#        print(i)
#        i+=1
# print("\n")
# i=1
# while i<=10:
#    if(i==5):
#        i+=1
#        continue
#    print(i)
#    i+=1