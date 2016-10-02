package task_14;

import task_11.Book;

public class ComparableBook extends Book implements Comparable<ComparableBook> {
	private int imbn;

	public ComparableBook(String title, String author, int price) {
		super(title, author, price);
	}

	public ComparableBook(String title, String author, int price, int imbn) {
		this(title, author, price);
		this.imbn = imbn;
	}

	@Override
	public int compareTo(ComparableBook otherObject) throws NullPointerException{
		if (otherObject==null){
			throw new NullPointerException("ComparableBook argument to compare with should be not null!");
		}
		return Integer.compare(imbn, otherObject.imbn);
	}
}
