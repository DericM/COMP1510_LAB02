
/**
 * 
 */

/**
 * @author Deric
 * Circle.java
 * print the area of a circle with 2 different radii
 *
 */
import java.util.Scanner;

public class Circle {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
        
        final double PI = 3.14159; 
        int radius;
        
        System.out.println("Please input a radius");
        
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        sc.close();
        
        double area = PI * radius * radius;
        double circumfrance = 2 * PI * radius;
        
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println("The circumfrance of a circle with radius " + radius + " is " + circumfrance);
        
        int radius2 = 2*radius; 
        double area2 = PI * radius2 * radius2;
        double circumfrance2 = 2 * PI * radius2;
        System.out.println("The area of a circle with radius " + radius2 + " is " + area2);
        System.out.println("The circumfrance of a circle with radius " + radius2 + " is " + circumfrance2);
        
        double areaChange = area2 / area *100;
        System.out.println("The change in the area is " + areaChange + "%");
        
        double circumfranceChange = circumfrance2 / circumfrance *100;
        System.out.println("The change in the circumfranceChange is " + circumfranceChange + "%");
        
    }
}



