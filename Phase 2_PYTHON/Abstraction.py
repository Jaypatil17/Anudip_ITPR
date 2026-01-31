class Abstraction :
    def __init__(self):
        self.brk=False
        self.acc=False
        self.cluch=False
    def Start(self):
        self.acc=True
        self.cluch=True
        print("Car Start")
a1=Abstraction()
a1.Start()

