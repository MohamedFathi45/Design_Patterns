import java.awt.Menu;
import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{

	int position;
	ArrayList items;
	public PancakeHouseIterator(ArrayList items) {
		position = 0;
		this.items = items;
	}
	@Override
	public boolean hasNext() {
		if(position < items.size())
			return true;
		return false;
	}

	@Override
	public Object next() {
		MenuItem item =(MenuItem)items.get(position);
		position = position + 1;
		return item;
	}

}
