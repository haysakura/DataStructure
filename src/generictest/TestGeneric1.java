package generictest;

import java.util.ArrayList;

public class TestGeneric1 {
	
	public static void main(String[] args)
	{
		new TestGeneric1().go();
	}
	
	public void go()
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		takeAnimals(animals);
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());		
		takeAnimals(dogs);
	}
	
	public void takeAnimals(ArrayList<? extends Animal> animals)
	{
		for(Animal a:animals)
		{
			a.eat();
		}
	}
	
//	public <T extends Animal> void takeThing(ArrayList<T> list)
//	public Void takeThing(ArrayList<? extends Animal> list)

}
