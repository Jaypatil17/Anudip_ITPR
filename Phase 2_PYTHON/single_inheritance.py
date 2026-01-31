class base :
    def demo(self):
        print("this is base class")
class derived(base):
    def demo1(self):
        print("this is derived class")

d1=derived()
d1.demo1()
d1.demo()
