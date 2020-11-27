
public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	public abstract void brew();
	public abstract void addCondiments();
	public void boilWater() {
		System.out.println("poiling the water");
	}
	public void pourInCup() {
		System.out.println("Pour the drink in cup");
	}
	boolean customerWantsCondiments() {
		return true;
	}
}
