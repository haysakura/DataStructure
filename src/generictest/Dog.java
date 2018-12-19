package generictest;

public class Dog extends Animal {
	void bark()
	{
		System.out.println("Dog barking");
	}
	
	@Override
	void eat()
	{
		System.out.println("Dog eating");
	}
}
