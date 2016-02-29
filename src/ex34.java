import java.util.Scanner;
public class ex34 {
    
    public static void main (String[] args)
    {
        int age;
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter your age");
        age = i.nextInt();
        
        if (age < 16)
        {
            System.out.println("You cant drive");
        }
        if (age<=17 && age>=16)
        {
            System.out.println("You can drive but not vote");
        }
         if (age<=18 && age>=24)
        {
            System.out.println("You can vote but not rent a car");
        }
         if(age>=25)
         {
             System.out.println("You can do pretty much everything");
         }
    }
}
