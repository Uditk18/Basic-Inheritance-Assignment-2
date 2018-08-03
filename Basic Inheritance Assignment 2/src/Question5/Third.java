//sub class
package Question5;

public class Third extends Second{											//child class inheriting class Second
	//default constructor
	Third()
	{
		super();
		System.out.println("Third level Constructor");
	}
	
	void display()
	{
		System.out.println("Third level display");
	}

}
