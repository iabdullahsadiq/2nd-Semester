from abc import ABC, abstractmethod

class Animal(ABC):
    def eat(self):
        pass
    def move(self):
        pass

class Dog(Animal):
    def __init__(self):
        pass
    def eat(self):
        print("Dog is eating")

    def move(self):
        print("Dog is moving")
        
dog = Dog()
dog.eat()
dog.move()