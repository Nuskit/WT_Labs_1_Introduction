package task_13;

import task_11.Book;

public class CloneBook extends Book implements Cloneable {

	public CloneBook(String title, String author, int price) {
		super(title, author, price);
	}

	@Override
	public CloneBook clone() {
        try {
        	return (CloneBook) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
	}
}
