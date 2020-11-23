
public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} 
		else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} 
		else 
			return null;
	}

}
