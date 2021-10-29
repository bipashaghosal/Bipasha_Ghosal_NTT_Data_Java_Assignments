package com.Mobile;
import java.util.ArrayList;
import java.util.Collections;

public class MeanMedian {
		 
		public static void Mean(ArrayList<Integer> arr) {
			double sum=0;
			for(int i = 0; i < arr.size(); i++) {
				sum+=arr.get(i);
			}
			System.out.println("Sum is : "+sum);
			double mean=sum/arr.size();
			System.out.println("Mean is : "+mean);
		}
		public static double Median(ArrayList<Integer> arr) {
			Collections.sort(arr);
			if(arr.size() % 2 == 1)
				return arr.get((arr.size() + 1)/ 2 - 1);
			else {
					double num1 = arr.get(arr.size() / 2 - 1);
				    double num2 = arr.get(arr.size() / 2);
				    return (num1+num2) / 2.0;
			}
		}

		public static void main(String[] args) {
			ArrayList<Integer> arr=new ArrayList<Integer>();
			arr.add(10);
			arr.add(20);
			arr.add(5);
			arr.add(50);
			arr.add(100);
			System.out.println("Elements are : "+arr);
			Mean(arr);
			System.out.println("Median is : "+Median(arr));

}
}
