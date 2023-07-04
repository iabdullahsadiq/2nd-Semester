class Car:
    def __init__(self, make, model, year, price):
        self.__make = make
        self.__model = model
        self.__year = year
        self.__price = price
        
    def get_make(self):
        return self.__make
    
    def get_model(self):
        return self.__model
    
    def get_year(self):
        return self.__year
    
    def get_price(self):
        return self.__price
    
class Sedan(Car):
    def __init__(self, make, model, year, price, num_doors):
        super().__init__(make, model, year, price)
        self.__num_doors = num_doors
        
    def get_num_doors(self):
        return self.__num_doors
    
class SUV(Car):
    def __init__(self, make, model, year, price, seating_capacity):
        super().__init__(make, model, year, price)
        self.__seating_capacity = seating_capacity
        
    def get_seating_capacity(self):
        return self.__seating_capacity
    
class SportsCar(Car):
    def __init__(self, make, model, year, price, top_speed):
        super().__init__(make, model, year, price)
        self.__top_speed = top_speed
        
    def get_top_speed(self):
        return self.__top_speed


Encapsulation
class Car:
    def __init__(self, make, model, year, price):
        self.__make = make
        self.__model = model
        self.__year = year
        self.__price = price
        
    def get_make(self):
        return self.__make
    
    def get_model(self):
        return self.__model
    
    def get_year(self):
        return self.__year
    
    def get_price(self):
        return self.__price
    
    def set_make(self, make):
        self.__make = make
        
    def set_model(self, model):
        self.__model = model
        
    def set_year(self, year):
        self.__year = year
        
    def set_price(self, price):
        self.__price = price

polymorphism
class Car:
    def __init__(self, make, model, year, price):
        self.make = make
        self.model = model
        self.year = year
        self.price = price
        
    def __str__(self):
        return f"{self.make} {self.model} ({self.year}) - ${self.price}"
        
    def print_info(self, cars):
        if isinstance(cars, Car):
            print(str(cars))
        elif isinstance(cars, list):
            for car in cars:
                print(str(car))