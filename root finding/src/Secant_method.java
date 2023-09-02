import java.util.Scanner;
public class Secant_method{
    
    public static void main(String args []){
    
        Scanner input = new Scanner(System.in);
        
        //initial values
        
//         System.out.print("x0: ");
//         double xn_0 = input.nextDouble();
//         System.out.print("x1: ");
//         double xn_1 = input.nextDouble();
        
        double xn_0 = 2;
        double xn_1 = 4;
        
        //enter your function
        
        double fxn_0 = Math.pow(xn_0,3) - 10;
        
        double fxn_1 = Math.pow(xn_1,3) - 10;
       

        
        double xn_1_1 = (xn_1) - fxn_1*( (xn_0 - xn_1)/(fxn_0 - fxn_1) );
        
        // TOL
         double TOL =Math.pow(10,-6);
         int counter = 1;
         
         System.out.println("Secant method\n");
         System.out.println("n | xn");
         System.out.println("--|-----------------");
         
         System.out.println(0 +" | "+xn_0);
         System.out.println(1 +" | "+xn_1);
         
         
         while(true){
             
             double fxn_1_1 = Math.pow(xn_1_1,3) - 10;
             
             if(Math.abs(fxn_1_1) < TOL){
                 break;
             }
             else{
                 xn_0 = xn_1;
                 xn_1 = xn_1_1;
                 
                 fxn_0 = Math.pow(xn_0,3) - 10;
                 fxn_1 = Math.pow(xn_1,3) - 10;
                 
                 xn_1_1 = xn_1 - fxn_1*( (xn_0 - xn_1)/(fxn_0 - fxn_1) );
                 counter++;

             }
             
             System.out.println(counter + " | " +xn_1_1);
             
         }
        
        
        
    }
    
}