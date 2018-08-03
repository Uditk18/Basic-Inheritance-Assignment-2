/*Child class inheriting SingleLevel*/
package Question4;

public class SecondLevel extends SingleLevel{
	
	int j=2;
	//default constructor
	SecondLevel()
	{
		super();
		System.out.println("Constructor for Second Level");
		
	}
	
	void display()
	{
	System.out.println("Second level");
	}
	
	
	
	

}
