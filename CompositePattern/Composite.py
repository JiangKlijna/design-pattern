# encoding = utf-8


class Component:
    def __init__(self, strName):
        self.m_strName = strName
    def Add(self,com):
        pass
    def Display(self,nDepth):
        pass

class Leaf(Component):
    def Add(self, com):
        print("leaf can't add")
    def Display(self, nDepth):
        strtemp = ""
        for i in range(nDepth):
            strtemp = strtemp + "-"
        strtemp = strtemp + self.m_strName
        print(strtemp)

class Composite(Component):
    def __init__(self, strName):
        self.m_strName = strName
        self.c = []
    def Add(self, com):
        self.c.append(com)
    def Display(self, nDepth):
        strtemp = ''
        for i in range(nDepth):
            strtemp = strtemp + "-"
        strtemp = strtemp + self.m_strName
        print(strtemp)
        [com.Display(nDepth + 2) for com in self.c]

if __name__ == "__main__":
    p = Composite("Jiang")
    p.Add(Leaf("Klijna"))
    p.Add(Leaf("Ling"))
    p1 = Composite("Hei")
    p1.Add(Leaf("Shi"))
    p.Add(p1)
    p.Display(1);
