import java.util.Scanner;


public class Factorial {
	
	public static long factorial(int n) 
	    { 
	        if (n <=1){
	          return 1;
	        }
	        else{
	        return n*factorial(n-1); 
	    } 
	    }
	   
	    public static void main(String[] args)  
	    { 
	    	Scanner scan = new Scanner(System.in);			
			System.out.print("Enter value n : ");
	        int n = scan.nextInt();
	        System.out.println("Factorial  is " + factorial(n));
	    } 
}