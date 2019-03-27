import java.util.Scanner;


public class Fibonacci {
	
		
	static int fibRek(int n) 
    { 
        if (n == 1 && n==0){ 
            return n; }
        else{
        return    fibRek (n - 1) + fibRek(n - 2); }
    } 
  
    public static void main(String args[]) 
    { 
    	Scanner scan = new Scanner(System.in);			
		System.out.print("Enter the position of the required number in the Fibonacci sequesnce");
        int n = scan.nextInt();
        System.out.println(fibRek(n)); 
    } 

	
	
    static int fib(int n, int a, int b)
    { 
//        int a=0,b = 1 ; 
        if (n == 0) {
            return 0;}
//       elseif(n==1){
//        	return 1;}
        else{
        for (int i = 2; i <= n; i++) 
        { 
   int  	temp = a + b; 
            a = b; 
            temp  = b;
        } 
        return b; 
        }
    } 
}
	
		
	
	//todo: The Fibonacci sequence is a sequence where the current number is the sum of the previous numbers. You can read it up here:
	//https://en.wikipedia.org/wiki/Fibonacci_number
	//Write an iterative method fib which takes an integer as parameter. This integer corresponds to the position in the Fibonacci sequence.
	//fib should return the fibonacci number at this position. For example, fib(4) should return 3.
	//Now, write a second methond fibRek. fibRek does exactly the same like fib, but it works recursive.
