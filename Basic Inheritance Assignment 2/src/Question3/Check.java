/*Program to access variables with different access specifiers*/
package Question3;

public class Check {
	
	int defaultVariable=10;
	private int privateVariable=20;
	public int publicVariable=30;
	protected int protectedVariable=40;
	
	public void display()
	{
		
		System.out.println("Private Variable : " +privateVariable);
		
	}

}
