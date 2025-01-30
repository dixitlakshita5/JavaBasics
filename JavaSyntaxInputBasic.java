import java.util.Scanner;
public class JavaSyntaxInputBasic {



        public static void main(String[] args){
            Scanner s = new Scanner(System.in); //new creates a new object for scanner class
            //scanner class is part of java.util package
            //system.in refers to the standard input stream
            //The constructor Scanner(System.in) is a special method that initializes the object with System.in as input
            //The object is M, which is an instance of the Scanner class. This object (M) is created and initialized by the Scanner(System.in) constructor, and it can be used to call methods like M.nextLine() or M.nextInt()
            int num1, num2;
            System.out.println("enter 1st num :");
            num1 = s.nextInt(); //nextint is a method of scanner object s and it will store the input in num1
            System.out.println("enter 2nd num :");
            num2 = s.nextInt();

            System.out.println("sum of numbers is : " + (num1+num2));
            //we use plus sign instead of a comma and also for summing the numbers we have added an bracket (num1+num20 thats how we can do it
        }


}
