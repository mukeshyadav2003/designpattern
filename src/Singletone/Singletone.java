package Singletone;

public class Singletone {

	private static Singletone singletone;             // first i changing class as a private
	
	
	private Singletone() {                        // create private constructor
		
		
	}
	
	public static Singletone getInstance() {              // create access method
		
		if(singletone==null) {                              //if singletone restrictions is the object create only one time so i am using programme (if ==null)create object
			                                                                  // else not null don't create object
			singletone = new Singletone();
		}
		
		
		return singletone;
		
		
	}
	
	public void did() {
		
		System.out.println("hi mukesh ");
		
	}
}
