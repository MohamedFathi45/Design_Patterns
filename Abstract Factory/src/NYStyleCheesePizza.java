public class NYStyleCheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory; 
	}
	
	@Override
	void prepare() {
		dough = ingredientFactory.createDough();
		cheese = ingredientFactory.createCheese();
		sauce = ingredientFactory.createSauce();
		clam = ingredientFactory.createClam();
	}

}
