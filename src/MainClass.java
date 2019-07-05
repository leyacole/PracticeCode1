import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		//GirlFriend GirlFriendObject = new GirlFriend();
		
		System.out.println("Enter name of first girlfriend: ");
		String input = scnr.nextLine();
		
		GirlFriend.setName(input);
		GirlFriend.message();
		
	    scnr.close();	
	
		

	}

}
