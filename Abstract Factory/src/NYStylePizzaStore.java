
public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		PizzaIngredientFactory ingredientFactory =new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza(ingredientFactory);
		}  
		else 
			return null;
	}

}