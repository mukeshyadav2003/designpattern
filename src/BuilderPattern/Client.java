package BuilderPattern;

public class Client {

	public static void main(String[] args) {

		Phone phone = new PhoneBuilder().setOs("mac").getPhone();
		System.out.println(phone.toString());
	}

}
