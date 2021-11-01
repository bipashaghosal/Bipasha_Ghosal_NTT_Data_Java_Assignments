package com.assessment;

import java.util.Scanner;

public class EnjoyRide {
	
	static void calTotal(int choice, int numAdults, int numChildren, int totalHours) 
    { 
		  int alibabaPriceAdult=50;
		  int alibabaPriceChild=40;
		  
		  int alpinePriceAdult = 60;
		  int alpinePriceChild = 30;
		  
		  int bumpperPriceAdult = 45;
		  int bumpperPriceChild = 25;
		  
		  int baloonPriceAdult = 70;
		  int baloonPriceChild = 60;
		  
	      switch (choice) {
	      case '1':
	      	 System.out.println("Ride Name : Alibaba");
	      	 System.out.println("Total number of hours" + totalHours);
	      	 System.out.println("Total adult fare "+ totalHours*numAdults*alibabaPriceAdult );
	      	 System.out.println("Total childre fare "+ totalHours*numChildren*alibabaPriceChild );
	      	 System.out.println("Total fare "+ (totalHours*numAdults*alibabaPriceAdult + totalHours*numChildren*alibabaPriceChild));
	         break;

	      case '2':
	      	 System.out.println("Ride Name : Alpine slide");
	      	 System.out.println("Total number of hours" + totalHours);
	      	 System.out.println("Total adult fare "+ totalHours*numAdults*alpinePriceAdult );
	      	 System.out.println("Total childre fare "+ totalHours*numChildren*alpinePriceChild );
	      	 System.out.println("Total fare "+ (totalHours*numAdults*alpinePriceAdult + totalHours*numChildren*alpinePriceChild));
	         break;

	      case '3':
      	
	    	  System.out.println("Ride Name : Bumpper Cars");
		      System.out.println("Total number of hours" + totalHours);
		      System.out.println("Total adult fare "+ totalHours*numAdults*bumpperPriceAdult );
		      System.out.println("Total childre fare "+ totalHours*numChildren*bumpperPriceChild );
		      System.out.println("Total fare "+ (totalHours*numAdults*bumpperPriceAdult + totalHours*numChildren*bumpperPriceChild));
		      break;
		      
	      case '4':
	        	
	    	  System.out.println("Ride Name : Baloon Race");
		      System.out.println("Total number of hours" + totalHours);
		      System.out.println("Total adult fare "+ totalHours*numAdults*baloonPriceAdult );
		      System.out.println("Total childre fare "+ totalHours*numChildren*baloonPriceChild);
		      System.out.println("Total fare "+ (totalHours*numAdults*baloonPriceAdult + totalHours*numChildren*baloonPriceChild));
		      break;
	     case '5':
	    	 System.out.println("Quit\n");
	    	 System.exit(0);
	    	 break;

	     default: System.out.println("Invalid choice");
           break;
  }
  } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numAdults, numChildren, totalHours;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of adults");
		numAdults = sc.nextInt();
		System.out.println("Enter number of children");
		numChildren = sc.nextInt();
		System.out.println("Enter total number of hours");
		totalHours = sc.nextInt();
		

		char input1;
		boolean inp = true;
		do {
	    System.out.println("Choose ride \n 1.Alibaba \n 2. Alpine Slide \n 3. Bumpper Cars \n 4. Baloon Race \n 5. Quit\n");
	    input1 = sc.next().charAt(0);
	    EnjoyRide demo = new EnjoyRide(); 
        demo.calTotal(input1, numAdults, numChildren,totalHours); 
  

	} while (inp);
	
	
		
	}

}
