# class Student :
#     def __init__(self,name):
#         self.name=name
#     def demo(self):
#         print("Hello",self.name)
#         a,b=10,20
#         print(a)#10
#         print(b)#20
#         print("Addition =",a+b)
# s1= Student("JP")
# s1.demo()

# #homework

# class Student:
#     def __init__(self,name,m1,m2,m3):
#         self.name=name
#         self.m1=m1
#         self.m2=m2
#         self.m3=m3
       
#     def avg_mark(self):
#         print("\nmark of subject 1 is:",self.m1)
#         print("mark of subject 2 is:",self.m2)
#         print("mark of subject 3 is:",self.m3)
#         avg=(self.m1+self.m2+self.m3)/3
#         print("\nAvg of 3 student is :",avg)

# s1=Student("Jayvardhan",85,95,87)
# s1.avg_mark()

# Homework 

class Account :
    def __init__(self,bal,acc_no):
        self.bal=bal
        self.acc_no=acc_no
        
    
    def credit(self,c):
        self.bal+=c
        print("\nThe Credited amount is",c," and current Balence is:",self.bal)

    def debit(self,d):
        self.bal-=d
        print("The debited amount is",d," and current Balence is:",self.bal)
    
    def printing(self):
        print("Current Bank Balence is :",self.bal)
        

a1=Account(2000,12345)
a1.printing()
a1.credit(1000)
a1.debit(200)