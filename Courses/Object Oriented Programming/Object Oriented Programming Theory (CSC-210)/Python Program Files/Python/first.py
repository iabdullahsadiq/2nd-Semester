class Orange:
    def __init__(self, Weight, Orchard, Date, Basket):
        self.Weight = Weight
        self.Orchard = Orchard
        self.Date = Date
        self.Basket = Basket
    def pick(self):
        for c in range (0, 10):
            print(f" Total Oranges in {self.Basket} are {c+1}")
    def squeeze (self):
        print(f" An Orange gives 300ml juice when squeezed")
s1=Orange(20, "Garden", "01-03-2023", 2)
s1.pick()
#print(f" Orange {e1.Weight},{e1.Date},{e1.Basket} are {c+1}")
s1.squeeze()