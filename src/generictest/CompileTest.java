package generictest;

import java.util.ArrayList;
import java.util.List;

public class CompileTest {
	
	ArrayList<Dog> dogs1 = new ArrayList<Animal>();
	
	List<Animal> animals1 = new ArrayList<Dog>();
	
	List<Animal> list = new ArrayList<Animal>();
	
	ArrayList<Dog> dogs = new ArrayList<Dog>();
	
	ArrayList<Animal> animals = dogs;
	
	List<Dog> doglist = dogs;
	
	ArrayList<Object> objects = new ArrayList<Object>();
	
	List<Object> objectlist = objects;
	
	ArrayList<Object> objs = new ArrayList<Dog>();
	

}
