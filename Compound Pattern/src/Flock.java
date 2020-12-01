import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
	ArrayList quackers;
	public Flock() {
		quackers = new ArrayList();
	}
	@Override
	public void Quack() {
		Iterator it = quackers.iterator();
		while(it.hasNext()) {
			Quackable q = (Quackable)it.next();
			q.Quack();
		}
	}

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	public Iterator createIterator() {
		return null;
	}
}
