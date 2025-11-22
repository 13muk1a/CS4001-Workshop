import java.util.Scanner;

/**
 * Write a description of class scenarioweek3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare{
public static void main(String[]args){
Scanner scan= new Scanner(System.in);

System.out.println ("***Welcome to Biratnagar Rickshaw Service***");
// fixed charges 
int basecharge= 20;
int perkm= 50;
int permin= 2;
System.out.println("The basecharge is:                          \t "+basecharge);
System.out.println("The perkm price is:                         \t "+perkm);
System.out.println("The permin price is:                        \t "+permin);
double localdiscount= 0.10; //10%
double surcharge= 0.20;     //20%
System.out.println("The localdiscount per person is               "+ localdiscount);
System.out.println("The surcharge for night travel per person is  "+ surcharge);


//total calculations 
System.out.println("The distance travelled(in km): ");
double distance = scan.nextDouble();

System.out.println("The time taken(mins):  ");
double timetaken= scan.nextDouble();

//total calculations 
double fare= basecharge + (distance * perkm)+(timetaken * permin);
System.out.println("The total fare is  :" + fare);

System.out.println("Are u local?(yes/no)? (1=yes,0=no)");
int local= scan.nextInt(); 

System.out.println("Is it night travel? (yes/no)? (1=yes, 0=no)");
int nighttravel= scan.nextInt();

//applying discount by using ternary operators 
fare=(local == 1)? (fare - (fare* localdiscount)): fare;

//applying night surcharge by  using ternary operators 
surcharge=(nighttravel== 1)? (fare+ (fare*surcharge)): fare;

System.out.println("the final fareis" +fare); 
System.out.println("the final fare after surcharge is" +surcharge);
}
}