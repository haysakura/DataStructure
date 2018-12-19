package songSet;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.border.TitledBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestTreeset {
	
	public static void main(String[] args)
	{
		new TestTreeset().go();
	}
	
	public void go()
	{
		 Book b1 = new Book("H", "Z");
		 Book b2 = new Book("Z", "Y");
		 Book b3 = new Book("T", "A");
		 Book b4 = new Book("Z", "Y");
		 
		 ArrayList<Book> booklist = new ArrayList<Book>();
		 booklist.add(b1);
		 booklist.add(b2);
		 booklist.add(b3);
		 booklist.add(b4);
		 System.out.println("The booklist is: " + booklist);		 
		 
		 TreeSet<Book> tree = new TreeSet<Book>();
		 tree.addAll(booklist);
		 System.out.println("The treeset is: " + tree);		 
	}

	class Book implements Comparable<Book>
	{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return title;
		}
		
		String title;
		String name;
		public Book(String b, String n)
		{
			title = b;
			name = n;
		}
		@Override
		public int compareTo(Book paramT) {
			// TODO Auto-generated method stub
			return title.compareTo(paramT.title);
		}		
	}
	
}
