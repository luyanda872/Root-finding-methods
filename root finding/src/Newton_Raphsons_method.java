import java.util.Scanner;

public class Newton_Raphsons_method{
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        //initial values
        
//         System.out.print("x0: ");
//         double xn = input.nextDouble();
         double xn = 2;
         
         System.out.println("Newton's method\n");
         System.out.println("n | xn");
         System.out.println("--|----------------------");
         
        //enter your function
        double fxn = Math.pow(xn,3)-10;
        double fpxn = 3*Math.pow(xn,2);
        
//         double fxn = Math.pow(xn,2)-4;
//         double fpxn = 2*xn;
        
        double xn_1 = xn - (fxn)/(fpxn);
        
        //TOL
        
        double TOL = Math.pow(10,-6);
        
        int counter =0;
        
        System.out.println(0 + " | " + xn);
        
        while(true){
            
            fxn = Math.pow(xn_1,3)-10;
            //fxn = Math.pow(xn_1,2)-4;
            
            if(Math.abs(fxn) < TOL){
                break;
            }
            else{
                
                fpxn = 3*Math.pow(xn_1,2);
                //fpxn = 2*xn_1;
                xn_1 = xn_1 - (fxn)/(fpxn);
                counter++;
            }
            System.out.println(counter+" | "+xn_1);
        }
        
    }
    
}