import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String fn,ln,log;
		char gd;
		int sid;
		double gpa;
		
		System.out.println("Please enter your information and press enter\n");
		
		System.out.println("First name:");
		fn = input.next();
		System.out.println("Last name:");
		ln =input.next();
		System.out.println("Grade (A-F):");
		gd = input.next().charAt(0);
		System.out.println("Student id number:");
		sid = input.nextInt();
		System.out.println("Login name:");
		log = input.next();
		System.out.println("GPA:");
		gpa = input.nextDouble();
		
		System.out.println();
		
		
		System.out.printf("Your name is %s %s\n "
				+ "You had grade %c\n"
				+ "This is your student id : %d\n"
				+ "This is your login name %s\n"
				+ "Your GPA is %f",fn,ln,gd,sid,log,gpa);
	}

}
