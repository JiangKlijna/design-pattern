# encoding = utf-8

class Context:
    def __init__(self):
        self.input=""
        self.output=""

class AbstractExpression:
    def Interpret(self, context):
        pass

class Expression(AbstractExpression):
    def Interpret(self, context):
        print("terminal interpret")

class NonterminalExpression(AbstractExpression):
    def Interpret(self, context):
        print("Nonterminal interpret")

if __name__ == "__main__":
    context = Context()
    c = []
    c = c + [Expression()]
    c = c + [NonterminalExpression()]
    c = c + [Expression()]
    c = c + [Expression()]
    for a in c:
        a.Interpret(context)
