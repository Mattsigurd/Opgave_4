import java.util.Scanner;

class Main{
	

	public static void main(String [] args){
		System.out.println("Please type in your name.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Please type in your age.");
		int age = scanner.nextInt();
		System.out.println(age);	

		if(age <= 67){
			System.out.println("You have ");
			System.out.println(67 - age);
			System.out.println(" years until retirement!");
		}	

	}
}