package sec01exam01;

public class Excetion3 {

	public static void method() throws ClassNotFoundException {
		Class.forName("dsdsdsds");
	}
	
	public static void main(String[] args) {
		try {
			method();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
