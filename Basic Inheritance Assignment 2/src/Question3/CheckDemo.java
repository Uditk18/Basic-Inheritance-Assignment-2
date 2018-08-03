package Question3;

public class CheckDemo {
	
	public static void main(String args[])
	{
		Check chck=new Check();
	
		
		System.out.println("Default Variable : " +chck.defaultVariable);          //Default,public and protected can be accessed directly.
		System.out.println("Public Variable : " +chck.publicVariable);
		System.out.println("Protected Variable : " +chck.protectedVariable);
		
		
		chck.display();															//private needs to be accessed indirectly.
	}

}
