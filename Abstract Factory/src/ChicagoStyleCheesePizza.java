
public class ChicagoStyleCheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;;
	public ChicagoStyleCheesePizza(PizzaIngredientFactory factory){
		this.ingredientFactory = factory;
	}
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}