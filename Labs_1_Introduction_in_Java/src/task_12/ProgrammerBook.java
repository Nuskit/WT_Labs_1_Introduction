package task_12;

import task_11.Book;

public class ProgrammerBook extends Book {
	private String language;
	private int level;
	
	public String getLanguage(){
		return language;
	}
	
	public int getLevel(){
		return level;
	}
	
	public ProgrammerBook(String title, String author, int price) {
		super(title, author, price);
	}

	public ProgrammerBook(String title, String author, int price, String language, int level) {
		this(title, author, price);
		this.language = language;
		this.level = level;
	}

	@Override
	public String toString() {
		return String.format("ProgrammerBook %s\n", informationBlock());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + level;
		return result;
	}

	@Override
	public boolean equals(Object checkObject) {
		if (this == checkObject){
			return true;
		}
		if (checkObject == null){
			return false;
		}
		if (!(checkObject.getClass() == getClass())){
			return false;
		}
		return isEqualsFields((ProgrammerBook)checkObject);
	}

	private boolean isEqualsFields(ProgrammerBook bookObject) {
		boolean isBookEquals=super.equals(bookObject);
		boolean isLanguageEquals = isEqualsLink(language, bookObject.language);
		boolean isLevelEquals = level == bookObject.level;
		return isBookEquals && isLanguageEquals && isLevelEquals;
	}
	
	@Override
	protected String informationBlock() {
		return String.format("%s, language=%s, level=%d", super.informationBlock(), language, level);
	}
}
