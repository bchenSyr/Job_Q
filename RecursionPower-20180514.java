// Created Date: May 14, 2018
// Application: calculate power recursively 

package myMain;

public class RecursionPower {

  // bad algorithm, too much iterations
  // will fail in this case: [1,2147483647] 
  // Time Complexity: O(b)
  // Space Complexity: O(1)
  public static long powerB1(int a, int b) {  	
  
	 if(b == 0) return 1;		   
	 if(a == 0) return 0;			  
	 long result = 1;
		 
	 for(long i = 0; i < b; i++) {
		 result *= a;
	 }		 
	return result;	 
  }	
	
  //bad algorithm, too much recursion
  // Time Complexity: O(b)
  // Space Complexity: O(b)
  public static long powerB2(int a, int b) {
			  
	if(b == 0) return 1;	// base case
	if(a == 0) return 0;	// this can omit
		
	return a * powerB2(a, b - 1);			    
  }


  // Time Complexity: O(log(b))
  // Space Complexity: O(log(b))
  public static long power(int a, int b) {
	if(a == 0) return 0;
	if(b == 0) return 1;
	long half = power(a, b / 2);
		
	if(b % 2 == 0) return half * half;
	else return half * half * a;	
  }	
	  		    	 
  public static void main(String[] args) {	
	System.out.print(power(1,2147483647)); 
  }
}
