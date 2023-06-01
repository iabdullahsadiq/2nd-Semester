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


class sedan(Car):
    def __init__(self, make, model, year, price, num_doors):
        super().__init__(make, model, year, price)
        self.__num_doors = num_doors

    def get_num_doors(self):
        return self.__num_doors


class suv(Car):
    def __init__(self, make, model, year, price, seating_capacity):
        super().__init__(make, model, year, price, seating_capacity)
        self.__seating_capacity = seating_capacity
        