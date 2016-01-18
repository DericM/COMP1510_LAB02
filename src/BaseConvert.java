import java.util.Scanner;

/**
 * 
 */

/**
 * @author Deric
 *
 */
public class BaseConvert {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int base10Num;
        int newBase;
        int maxNumber;
        int quotient;
        String baseBNum;
        
        int place0;
        int place1;
        int place2;
        int place3;
        
        Scanner scan = new Scanner(System.in); 
        System.out.println("\nWelcome to the Base Converter\n"); 
        
        //get input
        System.out.print("Enter a base 10 number to convert: "); 
        base10Num = scan.nextInt(); 
        System.out.print("Enter the base to convert to: "); 
        newBase = scan.nextInt();
        
        scan.close();
        
        maxNumber = (newBase * newBase * newBase * newBase) -1;
        System.out.println("maxNumber = " + maxNumber); 
        
        if(base10Num <= maxNumber){
        
            // First compute place0 -- the units place. Remember this comes 
            // from the first division so it is the remainder when the 
            // base 10 number is divided by the base (HINT %). 
            // Then compute the quotient (integer division / will do it!) 
            // You can either store the result back in base10Num or declare a 
            // new variable for the quotient
            place0 = base10Num % newBase;
            quotient = base10Num / newBase;
            
            // Now compute place1 -- this is the remainder when the quotient 
            // from the preceding step is divided by the base. 
            // Then compute the new quotient
            if(quotient<newBase){
                place1 = quotient;
                place2 = 0;
                place3 = 0;
            }
            else{
                
                place1 = quotient % newBase;
                quotient = quotient / newBase;
                
                if(quotient<newBase){
                    place2 = quotient;
                    place3 = 0;
                }
                else{
                    // Repeat the idea from above to compute place2 and the next quotient 
                    place2 = quotient % newBase;
                    quotient = quotient / newBase;
                    
                    // Repeat again to compute place3
                    place3 = quotient % newBase;
                }
            }                      
            baseBNum = ""+ place3 + place2 + place1 + place0;            
            System.out.println(base10Num + " --> Base" + newBase + " = " + baseBNum); 
            
        }
        else{
            System.out.println("Number is too big to fit in 4 bits");
        }
        

    }

}
