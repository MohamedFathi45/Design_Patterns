import java.util.Stack;
import java.util.Iterator;
public class CompositeIterator implements Iterator{
	Stack stack = new Stack();
	public CompositeIterator(java.util.Iterator it) {
		stack.push(it);
	}
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		}
		else {
			java.util.Iterator  iterator = (java.util.Iterator)stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}
			else {
				return true;
			}
		}
	}
	public Object next() {
		if(hasNext()) {
			java.util.Iterator  iterator = (java.util.Iterator) stack.peek();
			MenuComponent com = (MenuComponent)iterator.next();
			if(com instanceof Menu) {
				stack.push(com.createIterator());
			}
			return com;
		}
		else {
			return null;
		}
	}
}
