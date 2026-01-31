##Single inheritance

# class base :
#     def demo(self):
#         print("this is base class")
        
# class derived(base):
#     def demo1(self):
#         print("this is derived class")

# d1=derived()
# d1.demo1()
# d1.demo()

# #Multi-level Inheritance

# class grand_parent:
#     mark1=89
#     def saurabh(self):
#         print("\nSaurabh got ",self.mark1,"in this  year ")
    
# class parent(grand_parent):
#     mark2=85
#     def AD(self):
#         print("AD got ",self.mark2,"in this  year ")
  
# class child(parent):
#     def grater(self):
#         if(super().mark1>super().mark2):
#             print("Saurabh is the topper")
#         else:
#             print("AD is the topper")

# c1=child()
# c1.grater()
# c1.saurabh()
# c1.AD()

#Multiple Inheritance

class Base1 :
    def stud1(self,name,roll):
        self.name=name
        self.roll=roll
        print(name,"\n",roll)

class Base2 :
    def stud2(self,name,roll):
        self.name=name
        self.roll=roll
        print(name,"\n",roll)

class derived(Base1,Base2):
    def stud_record(self):
        print("Student Details is :\n")
        super().stud1("Jayvardhan",34)
        super().stud2("Swap",35)

d1=derived()
d1.stud_record()









