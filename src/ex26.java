import java.security.PrivilegedActionException;
import java.util.Scanner;
public class ex26 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		String planets[]= {"Venus","Mars","Jupiter","Saturn","Uranus","Neptune"};
		
		System.out.println("Enter your Weight on Earth");
		double w = i.nextDouble();
		System.out.println();
		
		int count =1;
		for(String t: planets)
		{
			System.out.println(count + ")" + t);
			count++;
		}
		
		System.out.println("Which of the planets do you want to fight on. Enter the corresponding number");
		int p = i.nextInt();
		
		double R=0;
		if (p==1)
		{
			R=0.78;
		}
		else if (p==2)
		{
			R=0.39;
		}
		else if(p==3)
		{
			R=2.65;
		}
		else if(p==4)
		{
			R=1.17;
		}
		else if(p==5)
		{
			R=1.05;
		}
		else if(p==6)
		{
			R=1.23;
		}
		
		System.out.printf("Your Mass on Planet %s is %f",planets[p-1],w*R);
		
	}

}
