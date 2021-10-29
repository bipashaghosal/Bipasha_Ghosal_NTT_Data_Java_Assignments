import java.util.*;
public class Checking {
	
	public static void main(String[] args) {

	    char option;
	    int  ans;
	    Double num1, num2, result;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter first number");
	    num1 = sc.nextDouble();
	    
	    System.out.println("Enter second number");
	    num2 = sc.nextDouble();
	    do{
	    
	    int c=0;
	    
	    System.out.println("Choose an option: 1,2,3,4,5,6");
	    option = sc.next().charAt(0);
	    
	    switch (option) {
	      case '1':
	        result = num1 + num2;
	        System.out.println("Adition is" + result);
	        break;

	      case '2':
	        result = (num1 + num2)/2;
	        System.out.println("Average is " + result);
	        break;

	      case '3':
	        if (num1 >0 && num2>0)
	        	System.out.println("They are positive numbers");
	        else if(num1 < 0 && num2 < 0)
	        	System.out.println("They are negative numbers");
	        else
	        	System.out.println("One is positive One is negative");
	        break;

	      case '4':
	        if (num1 %2==0 && num2%2==0) {
	        	System.out.println("Even");
	        }
	        else if (num1 %2==0 || num2%2==0)
	        	System.out.println("One is even One is odd");
	        else
	        	System.out.println("Both are Odd");
	        break;
	        
	      case '5':
	    	  for(int i=1;i<num1-1;i++)
              {
                  if(num1%i==0)
                  c++;
              }
              if(c==1)
                  System.out.println(num1+ " Prime Number");
              else
                  System.out.println(num1+ " Not a Prime Number");
              for(int i=1;i<num2-1;i++)
              {
                  if(num2%i==0)
                  c++;
              }
              if(c==1)
                  System.out.println(num2+ " Prime Number");
              else
                  System.out.println(num2+ " Not a Prime Number");
              break;

	      case '6':
	    	  System.exit(0);
	    	
	      default: System.out.println("Invalid choice");
	      
	    }
	    System.out.println("Will you like to continue 1. yes 2. no");
	    ans = sc.nextInt();
	    }
	    while(ans==1);

	    
	  
	    }

}


