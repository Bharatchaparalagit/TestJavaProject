
public class TestClass {
	
	public static void getUserPath(){
		String path = System.getProperty("user.dir");
		System.out.println(path);
	}

	public static void main(String[] args) {
		getUserPath();
		

	}

}
