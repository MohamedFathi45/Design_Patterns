
public class DecoratorPattern {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		espresso = new Mocha(espresso);
		espresso = new Mocha(espresso);
		espresso = new Milk(espresso);
		System.out.println(espresso.getDescription());
		System.out.println(espresso.cost());
	}
}
