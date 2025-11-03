// Armstrong Number

import java.util.Scanner;

public class question7 {
  public static void main(String[] args) {

    	    
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    int digits=0, temp=n;
	    int original=n;
	    while(temp!=0){
	        int rem=temp%10;
	        digits++;
	        temp=temp/10;
	    }
	    
	  
           temp=n;
           int sum=0;
	    while(temp!=0){
	        int digit=temp%10;
	        
	        sum+=Math.pow(digit,digits);
	        temp=temp/10;
	        
	        
	    }
	    if(original==sum){
	        System.out.println("Armstrong number");
	    }else{
	        System.out.println("Not Armstrong number");
	    }
	    


    
  }
}
