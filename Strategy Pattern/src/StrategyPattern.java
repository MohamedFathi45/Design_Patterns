
public class StrategyPattern {

	public static void main(String[] args) {
		
		FlyBehavior noFlying = new FlyNoWay();
		FlyBehavior flyWithWings = new FlyWithWings();
		QuackBehavior quack = new Quack();
		QuackBehavior mute = new MuteQuack();
		Duck mallardDuck = new MallardDuck(flyWithWings , quack);
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck = new MallardDuck(noFlying, mute);
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
	
}
