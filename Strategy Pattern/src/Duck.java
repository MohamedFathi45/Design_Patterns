
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public abstract void display();
	
	void performFly() {
		flyBehavior.fly();
	}
	void performQuack() {
		quackBehavior.Quack();
	}
	
}
