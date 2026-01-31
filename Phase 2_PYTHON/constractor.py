class Car :
    def __init__(self):
        model = "Marcedes"
        color = "Black"
        price = 5000000
        print("\n******Car Details******")
        print("\n Model Name =",model,"\n Car Color =",color,"\n Car Price =",price)
        
    
       
c1 = Car()


# Instance Attribute

class Sample :
    def __init__(self,name ,mark):
        print("\nStudent Details :")
        self.name=name #Instance Attribute
        self.mark=mark #Instance Attribute
    
s1=Sample("Jayvardhan",85)
print(s1.name,s1.mark)
s2=Sample("Saurabh",85)
print(s2.name,s1.mark)
       