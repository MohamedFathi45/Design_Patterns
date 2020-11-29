import java.util.ArrayList;

public class IteratorPattern {
	public static void main(String[] args) {
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		dinerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread",true,3.89));
		dinerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust, topped with vanilla icecream",true,1.59));
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
