package com.assessment;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FlowerDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, String> Asia = new HashMap<String, String>();
		Asia.put("India","Lotus");
		Asia.put("Pakistan","Jasmine");
		Asia.put("Nepal","LALI GURANS");
		
		HashMap<String, String> Europe = new HashMap<String, String>();
		Europe.put("GERMANY","CORN FLOWER");
		Europe.put("FRANCE","LILY");
		Europe.put("GREECE","ACANTHUS MOLLIS");
		
		
		HashMap<String, String> Africa = new HashMap<String, String>();
		Africa.put("EGYPT","BLUE LOTUS");
		Africa.put("NIGERIA","YELLOW TRUMPET ");
		Africa.put("KENYA","ORCHID");
		
		
		
		
		//HashMap<String, ArrayList<String>> continent_name = new HashMap<String, ArrayList<String>>();

		//continent.put("Asia", new ArrayList<String>());
		/*List<String> countries = new ArrayList<String>();
		countries.add("India","Lotus");
		countries.add("Pakistan","Jasmine");
		countries.add("Nepal","LALI GURANS");
		continent_name.put(continent_name, countries);*/
		
		
		
		System.out.println("Please type the country name");
		Scanner sc = new Scanner(System.in);
		String continent = sc.nextLine();
		//displayFlower demo = new displayFlower(continent);
		sc.close();
		
		if(continent.equalsIgnoreCase("Asia")) {
			Asia.forEach((k,v) -> System.out.println("Country : "+ k + ", National Flower : " + v));  
		}
		else if(continent.equalsIgnoreCase("Europe"))
		{
			Europe.forEach((k,v) -> System.out.println("Country : "+ k + ", National Flower : " + v));  
		}
		else if(continent.equalsIgnoreCase("Africa"))
		{
			Africa.forEach((k,v) -> System.out.println("Country : "+ k + ", National Flower : " + v));  
		}
		
		
		
		
		/*private static void displayFlower(String continent) {
		// TODO Auto-generated method stub
		if(continent.equalsIgnoreCase("Asia")) {
			Asia.forEach((k,v) -> System.out.println("Country : "+ k + ", National Flower : " + v));  
		}
		else if(continent.equalsIgnoreCase("Europe"))
		{
			Europe.forEach((k,v) -> System.out.println("Country : "+ k + ", National Flower : " + v));  
		}
		else if(continent.equalsIgnoreCase("Africa"))
		{
			Africa.forEach((k,v) -> System.out.println("Country : "+ k + ", National Flower : " + v));  
		}
		
	}*/
		
		
		//Integer value = 3;
	    /*for(Entry<String, String> entry: numbers.entrySet()) {

	      // if give value is equal to value from entry
	      // print the corresponding key
	      if(entry.getValue() == value) {
	        System.out.println("The key for value " + value + " is " + entry.getKey());
	        break;
	      }*/
		
		/*boolean keyValue = Asia.containsKey(continent);
		
		for (Map.Entry<String,Float> entry : Asia.entrySet()) //using map.entrySet() for iteration  
		{  
		//returns keys and values respectively  
		System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
		}  */
		
		//displayFlower(keyValue);
		//Asia.forEach((k,v) -> System.out.println("Country : "+ k + ", National Flower : " + v));  
		
		//boolean keyValue1 = Europe.containsKey(continent);
		
		//Europe.forEach((k1,v1) -> System.out.println("Country : "+ k1 + ", National Flower : " + v1));
//	}
 

	/*static void displayFlowers(int choice) 
    { 
      switch (choice) {
      case '1':
      	 System.out.println("Continent Name : ASIA");
   		 System.out.println("Country Name : INDIA  "+ "National Flower : LOTUS");
   		 System.out.println("Country Name : PAKISTAN"+ " National Flower : JASMINE");
   		 System.out.println("Country Name : NEPAL"+ " National Flower : LALI GURAS");
          break;

      case '2':
      	System.out.println("Continent Name : EUROPE");
  		 System.out.println("Country Name : GERMANY"+ " National Flower : CORN FLOWER");
  		 System.out.println("Country Name : FRANCE"+ " National Flower : LILY");
  		 System.out.println("Country Name : GREECE"+ " National Flower : ACANTHUS MOLLIS");
          break;

      case '3':
      	
      	System.out.println("Continent Name : AFRICA");
  		 System.out.println("Country Name : EGYPT"+ " National Flower : BLUE LOTUS");
  		 System.out.println("Country Name : NIGERIA"+ " National Flower : YELLOW TRUMPET");
  		 System.out.println("Country Name : KENYA"+ " National Flower : ORCHID");
          break;


      case '4':
          System.out.println("Quit\n");
          System.exit(0);
          break;

      default:
          System.out.println("Choose Continent Name");
          break;
  }
  } 
public static void main(String[] args) 
{ 
	char input1;
	Scanner sc = new Scanner(System.in);
	boolean inp = true;
	do {
   System.out.println("Choose continent \n 1 ASIA  \n 2 EUROPE \n 3 AFRICA \n 4 Quit\n");
   input1 = sc.next().charAt(0);
	 FlowerDemo demo = new FlowerDemo(); 
    demo.displayFlowers(input1); 
  

	} while (inp);
	
	
  } */
	      
	    }	
	
	
	
	}

   
