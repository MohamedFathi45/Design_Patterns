
public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		ChicagoPizzaIngredientFactory chicagoFactory = new ChicagoPizzaIngredientFactory();
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza(chicagoFactory);
		} 
		else 
			return null;
	}

}