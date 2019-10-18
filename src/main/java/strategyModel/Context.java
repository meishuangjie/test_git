package strategyModel;
/*
这个模式涉及到三个角色：
●　环境(Context)角色：持有一个Strategy的引用。
●　抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
●　具体策略(ConcreteStrategy)角色：包装了相关的算法或行为。
策略模式的使用场景：
1）针对同一种问题的多种处理方式、仅仅是因为具体行为有差别时，
2）需要安全的封装多种同一类型的操作时
3）出现同一抽象类有多个子类，而又需要使用if-else或者switch-case来选择具体子类时。
*/
public class Context {
	Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void doAction() {
		strategy.action();
	}

}
