package privateConstructor;

public class source {
	
	public static source ss;
	
	private source()
	{
		System.out.println("Private constructor is created!");
	}
	
	public static void test()
	{
		System.out.println("Test if ss is created! Yes!");
	}
	
	public static source createone()
	{
		if (ss == null)
		{
			ss = new source(); 
			System.out.println("create in createdone!");
		}
//		ss.test();
		return ss;
	}
	
}
