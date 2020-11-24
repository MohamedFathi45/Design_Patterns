
public class AbstractFactory {
	public static void main(String[] args) {
		NYStylePizzaStore nyStore = new NYStylePizzaStore();
		nyStore.orderPizza("cheese");
		ChicagoStylePizzaStore chicagoStore = new ChicagoStylePizzaStore();
		chicagoStore.orderPizza("cheese");
	}
}
