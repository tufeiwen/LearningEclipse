package org.totalbeginner.tutorial;

public class AppDriver {
	//application driver/controller
		public static void main(String[] args) {
			// create a new MyLibrary
			MyLibrary testLibrary = new MyLibrary("Test Drive Library");
			//b1 better be wap
			Book b1 = new Book("War And Peace");
			Book b2 = new Book("Great Expectations");
			b1.setAuthor("Tolstoy");
			b2.setAuthor("Dickens");
			Person jim = new Person();
			Person sue = new Person();
			jim.setName("Jim");
			sue.setName("Sue");
			testLibrary.addBook(b1);
			testLibrary.addBook(b2);
			testLibrary.addPerson(jim);
			testLibrary.addPerson(sue);
			System.out.println("Just created new library");
			testLibrary.printStatus();
			System.out.println("Check out War And Peace to Sue");
			testLibrary.checkOut(b1, sue);
			testLibrary.printStatus();
			System.out.println("Do some more stuff");
			testLibrary.checkIn(b1);
			//set up relationship between book and person
			testLibrary.checkOut(b2, jim);
			testLibrary.printStatus();
		}
}
