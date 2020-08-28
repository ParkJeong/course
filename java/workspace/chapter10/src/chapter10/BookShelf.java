package chapter10;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		this.shelf.add(title);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return this.shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.getCount();
	}
	
}
