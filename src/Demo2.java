import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {
	
public static void main(String args[]) { 

		String input1;
		String[] inputArr;
		List<Integer> ls = new ArrayList<Integer>();
		int sum = 0;
		int noOfCol;

	for(int i =0;i<2;i++) {
		
		System.out.println("Enter "+i+" row");
		
		Scanner input = new Scanner(System.in);	
		input1=input.nextLine();
		inputArr=input1.split(" ");
		for(int c =0;c<inputArr.length;c++) {
			
			System.out.println("inputArr "+inputArr[c]);
			
		}
		

		int[] integers = {1,2,3,4,5};
		
		// Creates the integer array.
		for (int i1 = 0; i1 < integers.length; i1++){
		    integers[i] = Integer.parseInt(inputArr[i]); 
		//Parses the integer for each string.
		}
		
		
		 for (int i5 = 0; i5 < inputArr.length; i5++) {
	         String numberAsString = inputArr[i5];
	         integers[i5] = Integer.parseInt(numberAsString);
	      }
		
		
		

	for(int c1 =0;c1<integers.length;c1++) {
			
			System.out.println("integers "+integers[c1]);
			
		}
		
		
		
		int max = integers[0];
		for(int i2 = 0; i2 < integers.length;i2++)
		{
			if(integers[i2] > max)
			{
				max = integers[i2];
			}
		}
		
		int minValue = integers[0]; 
	    for(int i3=0;i3<integers.length;i3++){ 
	      if(integers[i3] < minValue){ 
	        minValue = integers[i3]; 
	      } 
		
		
		
	}
	    System.out.println("max "+max);
	      System.out.println("min "+minValue);
	      int diff= max-minValue;
	      System.out.println("diff "+diff);
	      
	      ls.add(diff);
	
	
	}
	
	for(int g5=0;g5<ls.size();g5++)
	{
		
		sum=sum+ls.get(g5);
		
		
	}
	System.out.println("sum sum "+sum);
	
	}

}
