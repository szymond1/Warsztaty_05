package pl.coderslab.bean;

public class Book {

	private long id;
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String type;
	
	public Book() {}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getType() {
		return type;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
}
