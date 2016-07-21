# DesignPattern

- DesignPattern Implement By cpp, java, python...

模式名称|English|java|python|cpp
----|----|----|----|----
抽象工厂模式|AbstractFactory|[AbstractFactoryPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/AbstractFactoryPattern/AbstractFactoryPattern.java)|[AbstractFactoryPattern.py](https://github.com/JiangKlijna/DesignPattern/blob/master/AbstractFactoryPattern/AbstractFactoryPattern.py)|X
适配器模式|Adapter|[AdapterPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/AdapterPattern/AdapterPattern.java)|X|X
桥接模式|Bridge|[BridgePattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/BridgePattern/BridgePattern.java)|X|X
建造者模式|Builder|[BuilderPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/BuilderPattern/BuilderPattern.java)|X|X
责任链模式|Chain|[ChainPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/ChainPattern/ChainPattern.java)|X|X
命令模式|Command|[CommandPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/CommandPattern/CommandPattern.java)|X|X
组合模式|Composite|[CompositePattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/CompositePattern/CompositePattern.java)|X|X
装饰模式|Decorator|[DecoratorPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/DecoratorPattern/DecoratorPattern.java)|X|X
外观模式|Facade|[FacadePattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/FacadePattern/FacadePattern.java)|[FacadePattern.py](https://github.com/JiangKlijna/DesignPattern/blob/master/FacadePattern/FacadePattern.py)|X
工厂模式|Factory|[FactoryPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/FactoryPattern/FactoryPattern.java)|[FactoryPattern.py](https://github.com/JiangKlijna/DesignPattern/blob/master/FactoryPattern/FactoryPatternpy)|X
享元模式|Flyweight|[FlyweightPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/FlyweightPattern/FlyweightPattern.java)|X|X
解释器模式|Interpreter|[InterpreterPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/InterpreterPattern/InterpreterPattern.java)|X|X
迭代器模式|Iterator|[IteratorPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/IteratorPattern/IteratorPattern.java)|X|X
中介模式|Mediator|[MediatorPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/MediatorPattern/MediatorPattern.java)|X|X
备忘录模式|Memento|[MementoPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/MementoPattern/MementoPattern.java)|X|X
观察者模式|Observer|[ObserverPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/ObserverPattern/ObserverPattern.java)|X|X
原型模式|Prototype|[PrototypePattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/PrototypePattern/PrototypePattern.java)|X|X
代理模式|Proxy|[ProxyPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/ProxyPattern/ProxyPattern.java)|X|X
单例模式|Singleton|[SingletonPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/SingletonPattern/SingletonPattern.java)|X|X
状态模式|State|[StatePattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/StatePattern/StatePattern.java)|X|X
策略模式|Strategy|[StrategyPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/StrategyPattern/StrategyPattern.java)|X|X
模板方法模式|Template|[TemplatePattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/TemplatePattern/TemplatePattern.java)|X|X
访问者模式|Visitor|[VisitorPattern.java](https://github.com/JiangKlijna/DesignPattern/blob/master/VisitorPattern/VisitorPattern.java)|X|X

- 设计模式所支持的设计的可变方面

目的|设计模式|可变的方向
----|----|----
创建|AbstractFactory|产品对象家族
......|Builder|如何创建一个组合对象
......|Factory|被实例化的子类
......|Prototype|实例化的子类
......|Singleton|一个类的惟一实例
结构|Adapter|对象的接口
......|Bridge|对象的实现
......|Composite|一个对象的结构和组成
......|Decorator|对象的职责,不生成子类
......|Facade|一个子系统的接口
......|Flyweight|对象的存储开销
......|Proxy|如何访问一个对象;该对象的位置
行为|Chain|满足一个请求的对象
......|Command|何时,怎样满足一个对象
......|Interpreter|一个语言的文法及解释
......|Iterator|如何遍历,访问一个聚合的各元素
......|Mediator|对象间怎样交互,和谁交互
......|Memento|一个对象中哪些私有信息存放在该对象之外,以及在什么时候存储
......|Observer|多个对象依赖于另外一个对象,而这些对象又如何保持一致
......|State|对象的状态
......|Strategy|算法
......|Template|算法中的某些步骤
......|Visitor|某些可以作用于一个(组)对象上的操作,但不能修改这些对象的类
