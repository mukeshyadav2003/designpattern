package Singletone;

public class main {

	public static void main(String[] args) {
		
		Singletone single =Singletone.getInstance();
		Singletone single1 =Singletone.getInstance();
		
		single.did();
		
		
	}

}
