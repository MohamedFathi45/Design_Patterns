
public class MallardDuck extends Duck{
	
	public MallardDuck(FlyBehavior fly , QuackBehavior quack) {
		this.flyBehavior = fly;
		this.quackBehavior = quack;
	}
	
	@Override
	public void display() {
		System.out.println("mallard duck");
	}
}
