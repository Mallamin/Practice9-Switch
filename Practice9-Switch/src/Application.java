import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value:");
		
		String command=input.nextLine();
		
		switch(command) {
		case "Start":
			System.out.println("Machine started.");
			break;
		case "Stop":
			System.out.println("Machine stopped.");
			break;
			
			default:
				System.out.println("Wrong command.");
		}
		

	}
}
