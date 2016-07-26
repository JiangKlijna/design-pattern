# encoding = utf-8

import os

class Dog(object):
    def __init__(self):
        self.name = "Dog"

    def bark(self):
        return "woof!"

class Cat(object):
    def __init__(self):
        self.name = "Cat"

    def meow(self):
        return "meow!"

class Human(object):
    def __init__(self):
        self.name = "Human"

    def speak(self):
        return "'hello'"

class Car(object):
    def __init__(self):
        self.name = "Car"

    def make_noise(self, octane_level):
        return "vroom%s" % ("!" * octane_level)

class Adapter(object):
    """
    Adapts an object by replacing methods.
    Usage:
    dog = Dog
    dog = Adapter(dog, dict(make_noise=dog.bark))
    """
    def __init__(self, obj, adapted_methods):
        """We set the adapted methods in the object's dict"""
        self.obj = obj
        #self.__dict__.update(adapted_methods)
        self.__dict__['make_noise'] = adapted_methods

    def __getattr__(self, attr):
        """All non-adapted calls are passed to the object"""
        return getattr(self.obj, attr)

def main():
    dog = Dog()
    cat = Cat()
    human = Human()
    car = Car()

    objs = [Adapter(dog, dog.bark), Adapter(cat, cat.meow), Adapter(human, human.speak), Adapter(car, lambda: car.make_noise(3))]
    for obj in objs:
        print(obj.name, "goes", obj.make_noise())

if __name__ == "__main__":
    main()
