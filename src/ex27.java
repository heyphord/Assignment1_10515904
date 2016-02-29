import java.util.Scanner;
public class ex27 {

	public static void main(String[] args) {
			Scanner i = new Scanner(System.in);
			int Total=0,ans;
			
			String qstn,m1,m2,m3;
			qstn=m1=m2=m3="";
			
			qstn="solve for x+3=5";
			m1="2";
			m2 = "3";
			m3 = "4";
			
			System.out.printf("1) %s\n1)%s\n2)%s\n3)%s\n",qstn,m1,m2,m3);
			ans =  i.nextInt();
			if (ans ==2)
			{
				System.out.println("Correct\n");
				Total++;
				
			}
			else
				System.out.print("Wrong\n");
			
			qstn="Which of the following is a programming language?";
			m1="Python";
			m2 = "Excel";
			m3 = "Notepad";
			
			System.out.printf("1) %s\n1)%s\n2)%s\n3)%s\n",qstn,m1,m2,m3);
			ans =  i.nextInt();
			if (ans ==1)
			{
				System.out.println("Correct\n");
				Total++;
				
			}
			else
				System.out.print("Wrong\n");
			
			qstn="Kofi is a boy, True or False";
			m1="True";
			m2 = "Dont Know";
			m3 = "False";
			
			System.out.printf("1) %s\n1)%s\n2)%s\n3)%s\n",qstn,m1,m2,m3);
			ans =  i.nextInt();
			if (ans ==1)
			{
				System.out.println("Correct\n");
				Total++;
				
			}
			else
				System.out.print("Wrong\n");
			
			System.out.print ("You had "+ Total + " out of 3");
	}
	
}

