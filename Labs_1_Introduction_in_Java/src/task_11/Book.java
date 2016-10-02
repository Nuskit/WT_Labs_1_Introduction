package task_11;

//TODO: check override equals
public class Book {
	private String title;
	private String author;
	private int price;
	private static int edition;

	public String getTitle() {
		return title;
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object checkObject) {
		if (this == checkObject){
			return true;
		}
		if (checkObject == null){
			return false;
		}
		if (!(checkObject.getClass() == getClass()))
		{
			return false;
		}
		return isEqualsFields((Book) checkObject);
	}

	protected boolean isEqualsLink(Object left, Object right) {
		return left == null ? right == null : left.equals(right);
	}

	private boolean isEqualsFields(Book bookObject) {
		boolean isAuthorEquals = isEqualsLink(author, bookObject.author);
		boolean isPriceEquals = price == bookObject.price;
		boolean isTitleEquals = isEqualsLink(title, bookObject.title);
		return isAuthorEquals && isPriceEquals && isTitleEquals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + price;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return String.format("Book %s\n", informationBlock());
	}

	protected String informationBlock() {
		return String.format("title=%s, author=%s, price=%d, edition=%d", title, author, price, edition);
	}
}
