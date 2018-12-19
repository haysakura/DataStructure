package generictest;

import java.util.List;

public class TestGeneric2 {
	
	public static void main(String[] args) {
		new TestGeneric2().go();
	}
	
	public void go()
	{
		List<? super Dog> list = null;
		
		list.add(new Dog());
//		list.add(new Cat());
		list.add(new BianmuDog());

//		list.add(new Animal());
		
		List<? extends Dog> list2 = null;
		
		List<?> list3 = null;
		

	}

}
