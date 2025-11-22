import java.util.Scanner;

/**
 * Write a description of class gradeevaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gradeevaluator{
    public static void main(String[]args)
    {
         Scanner scan = new Scanner(System.in);
         System.out.println("enter your grade :");
          int grade= scan.nextInt();
          System.out.println( "The grade is :"+grade);
          String a = (grade >=40) ? "your results is:\nPASS":"your result is:\nFAIL";// true or false
         System.out.println(a);
    }
}