package org.totalbeginner.tutorial;

public class Book {
	String title;
	String author;
	//hold a relationship with person,associate
	Person person;

	public Book(String string) {
		this.title = string;
		this.author = "unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setPerson(Person p2) {
		this.person = p2;
	}

	public Person getPerson() {
		return this.person;
	}
	public String toString(){
		String whom=this.person!=null?this.person.getName():"no one";
		return "Book: title "+this.title+" author "+this.author+" borrowed by "+whom;
	}
}
