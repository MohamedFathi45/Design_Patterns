
public class TemplateMethod {
	public static void main(String[] args) {
		CaffeineBeverage tea = new Tea();
		CaffeineBeverage coffe = new Coffee();
		tea.prepareRecipe();
		coffe.prepareRecipe();
	}
	
}
