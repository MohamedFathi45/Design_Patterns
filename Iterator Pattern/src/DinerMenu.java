import java.util.ArrayList;
import java.util.Iterator;
public class DinerMenu extends Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	ArrayList menuItems;
	public DinerMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("Vegetarian BLT","(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT","Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese",false, 3.05);
	}
	public void addItem(String name, String description,boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	public Iterator createIterator() {
		return menuItems.iterator();
	}
	
}
