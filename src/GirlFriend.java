
public class GirlFriend {
	private static String girlName;
	
	public static void setName(String name) {
		girlName = name;
	}
	
	public static String getName() {
		return girlName;
	}
	
	public static void message() {
		System.out.printf("The name of your first girlfriend was: %s", getName());
	}

}
