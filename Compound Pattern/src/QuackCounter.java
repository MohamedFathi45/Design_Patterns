
public class QuackCounter implements Quackable{
	Quackable duck;
	static int quacks =0;
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	@Override
	public void Quack() {
		duck.Quack();
		quacks++;
	}
	int getQuacks(){
		return quacks;
	}
}
