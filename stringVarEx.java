package stringVarEx;

import java.util.Scanner;

public class stringVarEx {
	
	private static Scanner input;
	
	public static void main(String[] args){
	
	String g = "greetings";
	String name = "Everyone";
	   name=name.trim();        // couldn't figure out how to 
	   
	System.out.print(g.toUpperCase());    //capitalize "greetings" (introduction)
	System.out.println(name.trim());
	
	input = new Scanner(System.in);
	String str = " Should we fly?, Should we drive?"; 
	String hangar1[ ] = str.split(",");        // set delimiter for replace method
	str=str.replace("Should", "How about");    // replace method implementation
	
	 Scanner vehicleDisplay = new Scanner("1.Koenigsegg,2.Ferrari,4.G63 AMG 6x6,5.Bombardier Global 6000");
	 vehicleDisplay.useDelimiter(",");      // set the delimiter
	
	
	System.out.println("Welcome to my hangar!"); 
	System.out.println();  //break

	while(vehicleDisplay.hasNext()) {
		
	String temp = vehicleDisplay.next();
		System.out.println(temp);  
	}
	
	System.out.println(); //break
	System.out.println("What do you think?");
	
	for(int i = 0; i<hangar1.length; i++) {
		System.out.println("-->" +hangar1[i]);
	}
	
	System.out.println();   //break 
	System.out.println(str);	 //replace method
	
	
	}
	  
}
