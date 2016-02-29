import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		String name;
		int age;
		double salary;
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease What is your name");
		name =input.next();
		System.out.printf("Your %s is %s\n","name",name);
		
		System.out.println("\nPlease What is your age");
		age =input.nextInt();
		System.out.printf("Your %s is %d \n","age",age);
		
		System.out.println("\nHow much money do you make");
		salary = input.nextDouble();
		System.out.printf("Your %s is %f\n","salary",salary);
	}

}
