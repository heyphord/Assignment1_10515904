import java.util.Scanner;
public class ex37 {
    
    public static void main(String[] args)
    {
        String fname,lname;
        int age;
        char g;
        Scanner i = new Scanner(System.in);
            System.out.println("Are you male or female. (m or f):");
            g= i.next().charAt(0);

        System.out.println("Please what is your first name");
        fname = i.next();
        System.out.println("Please what is your last name");
        lname = i.next();
        System.out.println("Please what is your age");
        age = i.nextInt();
        
        if(age>=20 && g == 'f')
        {
       System.out.println("Are you married? (y or n)");
       char x = i.next().charAt(0);
        if(x=='y')
        {
                System.out.println("Hello Mrs." + fname +" "+ lname);
        }
        }
        else
            System.out.println("Hello " + fname + " "+ lname);
        
        if(age>=20 && age=='m')
        {
            System.out.println("Hello Mr." + fname +" "+ lname);
        }
        else
            System.out.println("Hello " + fname +"  "+ lname);
    }
}
