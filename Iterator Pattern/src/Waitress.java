import java.util.ArrayList;
import java.util.Iterator;
public class Waitress {
	MenuComponent menues;
	public Waitress(MenuComponent menues) {
		this.menues = menues;
	}
	public void printMenu() {
		menues.print();
	}
	public void printVegetarianMenu() {
		Iterator iterator = menues.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			}catch(UnsupportedOperationException e) {}
		}
	}
}
