
/**
 * Write a description of class defaultvaluechecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c; 
    boolean bool; 

public static void main(String[]args){
    DefaultValues v1= new DefaultValues();
    
    System.out.println("byte: " +v1.b);
    System.out.println("short: " + v1.s);
    System.out.println("int: "+ v1.i);
    System.out.println("long: "+ v1.l);
    System.out.println("float: " + v1.f);
    System.out.println("double: " + v1.d);
    System.out.println("char: " + v1.c);
    System.out.println("boolean: " + v1.bool);
}
}
