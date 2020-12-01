
public class CompoundPattern {
	public static void main(String[] args) {
		CompoundPattern simulator = new CompoundPattern();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable goose = new GooseAdapter(new Goose());
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(goose);
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add( duckFactory.createMallardDuck() );
		flockOfMallards.add( duckFactory.createMallardDuck() );
		flockOfMallards.add( duckFactory.createMallardDuck() );
		flockOfMallards.add( duckFactory.createMallardDuck() );
		
		simulate(flockOfDucks);
		simulate(flockOfMallards);
		
		System.out.println("The ducks quacked "+QuackCounter.quacks +" times");
	}
	void simulate(Quackable duck) {
		duck.Quack();
	}
}
