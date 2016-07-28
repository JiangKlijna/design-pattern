# encoding = utf-8

class Singleton(object):
    __instance = None
    def __new__(cls):
        #if not hasattr(cls, 'instance'):
        #    cls.instance = super(Singleton, cls).__new__(cls)
        #return cls.instance
        if not cls.__instance:
            cls.__instance = super(Singleton, cls).__new__(cls)
        return cls.__instance


s = Singleton()
s1 = Singleton()
print("Object created", s, s1)

print(s == s1)
