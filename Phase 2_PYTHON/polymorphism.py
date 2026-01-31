class polymorphism :
    def __init__(self,real,img):
        self.real=real
        self.img=img

    def show_num(self):
        print(self.real,"i +" ,self.img,"j")
    
    def __add__(self,n2):
        new_real=self.real+n2.real
        new_img=self.img + n2.img
        return polymorphism(new_real,new_img)

    def __sub__(self,n2):
        new_real=self.real - n2.real
        new_img=self.img - n2.img
        return polymorphism(new_real,new_img)
    
n1=polymorphism(3,5)
n1.show_num()

n2=polymorphism(5,7)
n2.show_num()

n3=n1+n2
n3.show_num()
print("\n")
n4=n1-n2
n4.show_num()