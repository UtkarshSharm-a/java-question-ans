// Check Prime Number

import java.util.Scanner;

public class question5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    boolean isprime=true;
	    
	    if(n<=1){
	        isprime=false;
	    }else{
	        for(int i=2;i<=n;i++){
	            if(n%2==0){
	                isprime=true;
	                break;
	            }
	        }
	    }
	    if(isprime){
	        System.out.println("Prime number"); 
	    }else{
	        System.out.println("not a prime number");
	    }
	   
  }
  
}
