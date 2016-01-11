/**
 * 
 */

/**
 * @author Deric
 *
 */
import java.util.Scanner;

public class LabGrade {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Declare constants
        double inWeight; // in-class weight is 60% 
        double outWeight; // out-of-class weight is 40%
        
        // Declare variables 
        int preLabPts; //number of points earned on the pre-lab assignment 
        int preLabMax; //maximum number of points possible for pre-lab 
        int labPts; 
        int labMax;
        //number of poitns earned on the lab //maximum number of points possible for lab
        int postLabPts; //number of points earned on the post-lab assignment 
        int postLabMax; //maximum number of points possible for the post-lab 
        double outClassAvg; //average on the out of class (pre and post) work 
        double inClassAvg; //average on the in-class work 
        double labGrade; //final lab grade
        
        Scanner scan = new Scanner(System.in); // Get the input 17 20 23 25 12 15 0.6
        System.out.println("\nWelcome to the Lab Grade Calculator\n"); 
        System.out.print("Enter the number of points you earned on the pre-lab: "); 
        preLabPts = scan.nextInt(); 
        System.out.print("What was the maximum number of points you could have earned? "); 
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab: "); 
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the lab? "); 
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab: "); 
        postLabPts = scan.nextInt(); 
        System.out.print("What was the maximum number of points for the post-lab? "); 
        postLabMax = scan.nextInt(); 
        System.out.print("What was the weight for the in class work in decimal form? "); 
        inWeight = scan.nextDouble();         
        System.out.println();
        

        // Calculate the average for the out of class work 
        outClassAvg = 100.0 * (preLabPts + postLabPts) / (preLabMax + postLabMax);
        // Calculate the average for the in-class work 
        inClassAvg = 100.0 * labPts / labMax;
        // Calculate the weighted average taking 40% of the out-of-class average 
        // plus 60% of the in-class
        outWeight = 1 - inWeight;
        labGrade = outWeight * outClassAvg + inWeight * inClassAvg;
        // Print the results 
        System.out.println("Your average on out-of-class work is " + outClassAvg + "%"); 
        System.out.println("Your average on in-class work is " + inClassAvg + "%"); 
        System.out.println("Your lab grade is " + labGrade + "%"); 
        System.out.println();
            
    }
}
