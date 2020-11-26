
public class Adpaterpattern {
	public static void main(String[] args) {
		Duck d = new MallardDuck();
		Turkey t = new WildTurkey();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(t);
		testDuck(d);
		testDuck(turkeyAdapter);
	}
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}	
