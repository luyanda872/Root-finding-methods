import java.util.Scanner;

public class Halleys_method{
     
     public static void main(String args []){
         
         Scanner input = new Scanner(System.in);
         
         //initial guess
         //System.out.print("x0: ");
         //double xn = input.nextDouble();
         double xn = 2;
         
         //enter your functions
         
         double fxn = Math.pow(xn,3) - 10;
         double fpxn = 3*Math.pow(xn,2);
         double fppxn = 6*xn;
         
         double xn_1 = xn - (2*fxn*fpxn)/( (2 * Math.pow((fpxn),2)) - fxn*fppxn );
         
         // TOL
         
         double TOL = Math.pow(10,-6);
         
 
         int counter = 0;
         
         System.out.println("Halleys method\n");
         System.out.println("n | xn");
         System.out.println("--|-------------------");
         System.out.println(0 + " | " +xn);
         while(true){
             
             fxn = Math.pow(xn_1,3) - 10;
             if(Math.abs(fxn) < TOL){
                 break;
             }
             
             else{
                 xn = xn_1;
                 fpxn = 3*Math.pow(xn_1,2);
                 fppxn = 6*xn_1;
                 xn_1 = xn - (2*fxn*fpxn)/( (2 * Math.pow((fpxn),2)) - fxn*fppxn );
                 counter++;
             }
            
             
             System.out.println(counter + " | " +xn_1);
         }
         
         
         
     }
     
}