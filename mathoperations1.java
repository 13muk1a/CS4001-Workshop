
/**
 * Write a description of class mathoperations1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathoperations1{
    public static void main(String []args){
        int a= 2;
        int b=6;
        int c= a+b; 
        int d= a-b;
        int e= a*b;
        int f= a/b;
        System.out.println("the sum is- " + c);
        System.out.println("the difference is- " + d);
        System.out.println("the product is- " + e);
        System.out.println("the division is- " +f);
        
        System.out.println(a++);
        System.out.println(a);
        
        System.out.println(++a);
        System.out.println(a);
        
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a!=b);
        
        int age= 18;
        String isvalid= (age>=18)? "He can drive": "He cannot drive";
    }
}