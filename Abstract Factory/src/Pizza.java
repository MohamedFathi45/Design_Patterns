import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clams clam;
	Veggies veggies[];
	abstract void prepare();
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
}