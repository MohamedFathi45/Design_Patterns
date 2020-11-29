import java.awt.MenuContainer;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	Iterator iterator = null;
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;
	public Menu() {
	}
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	@Override
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		java.util.Iterator it = menuComponents.iterator();
		while(it.hasNext()) {
			MenuComponent menuComponent =(MenuComponent) it.next();
			menuComponent.print();
		}
	}
	@Override
	public Iterator createIterator() {
		if(iterator == null)
			iterator =  new CompositeIterator(menuComponents.iterator());
		return iterator;
	}
	
}
