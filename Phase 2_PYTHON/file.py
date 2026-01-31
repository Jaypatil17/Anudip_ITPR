# #read mode

# f=open("demo.txt","r")
# data=f.read()
# data1=f.readline()
# data2=f.readline()
# print(data)
# print( data1)
# print(data2)
# f.close()

# #write mode

# f=open("demo.txt","w")
# f.write(" file openning with write mode ,")

# f=open("demo.txt","a")
# f.write(" \n his can be write at the end of file")

# f.close()

# #homework 
 
# with open("practice.txt","w+") as f:
#     f.write("hi everyone\nWe are learning file i/o")
#     f.write("\nusing java\nI like programming in java")

# word="learning"
# def checking ():
#     with open("practice.txt","r") as f:
#         data = f.read()

#     a=data.replace("Java","Python")
#     print(a)

#     with open("practice.txt","w+") as f:
#         f.write(a)
    
#     if(word in data):
#         print("found")
#     else:
#         print("not found")

# checking()

# def finding():
#     word="programming"
#     data =True
#     line =1
#     with open("practice.txt","r") as f:
#         while data:
#             data=f.readline()
#             if(word in data):
#                 print(line)
#                 return
#                 line += 1

#     return -1

# finding()        


#homework 

with open("Sample.txt","w") as f:
    f.write("12,11,13,14,15,16,17,18")

with open("Sample.txt","r") as f:
    data=f.read()
    print(data)
    print(type(data))
