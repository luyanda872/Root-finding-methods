import java.util.Scanner;
public class Bisection_method{

    public static double a;
    public static double b;
    

    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
       
        //enter interval [a,b]
        //System.out.println("enter interval [a,b]");
        //System.out.print("a: ");
        a = 2;// input.nextDouble();
       // System.out.print("b: ");
        b = 4;//input.nextDouble();
        
       System.out.println("Bisection_method");
       
       System.out.println("\nInterval ["+a+","+b+"]");
       System.out.println("\nn | c\n--|---------------------");
        
        // TOL
        
        double TOL = Math.pow(10,-6);
        
        
        double c = -1;
        
        if(sign(a)*sign(b) > 0){
            System.out.println("root doesn't lie in the interval");
        }
        
        else{
            int counter = 0;
            double root;
            while(true){
                
                double fa = function(a);
                double fb = function(b);
                
                if(Math.abs(fa) < TOL || Math.abs(fb) < TOL){
                    System.out.println("\nroot: "+c);
                    break;
                }
                else{
                    
                    c = a + (b-a)/2;
                    
                    changeIntv(a,b,c);
                    
                    System.out.println(++counter+" | "+c);
                }
                
                
            }
            
        }

    
    }
    
    public static double function(double x){
    
        //Enter your function
        // x^3 - 10
        double fx = Math.pow(x,3) - 10;
        //double fx = Math.abs(x-3) - 10;
        return fx;
    }
    
    
    public static void changeIntv(double A,double B,double c){
        
        if(sign(A) == sign(c)){
            a = c;
        }
        else if(sign(B) == sign(c)){
            b = c;
        }
        
    }
    
    
    public static int sign(double x){
        int s = 1;
        double fx = Math.pow(x,3) - 10;
        //double fx = Math.abs(x-3) - 10;
        if(fx < 0){
            s = -1;
        }
        
        return s;
    }
    
}