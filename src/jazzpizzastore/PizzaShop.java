package jazzpizzastore;

import java.util.Scanner;

public class PizzaShop {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        System.out.println("Enter customer name: ");
	        String name = in.nextLine();
	      //Prompting for user input for type and validating it
	        System.out.println("What type of pizza would you like, regular or feast ");
	        String type = in.nextLine();
	        while(!(type.equalsIgnoreCase("regular")||type.equalsIgnoreCase("feast"))) 
	        {
	        	System.out.println("What type of pizza would you like, regular or feast ");
		        type = in.nextLine();
	        }
	        //Prompting for user input for size and validating it
	        System.out.println("What size of pizza would you like, small, medium or large? ");
	        String size = in.nextLine(); 
	        while(!(size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium") || size.equalsIgnoreCase("Large") ))
	        {
	        	System.out.println("What size of pizza would you like, small, medium or large? ");
	        	 size = in.nextLine();
	        }
	        
	        
	        if (type.equalsIgnoreCase("regular")){
	        	Pizza obj1=new Regular(type,size);
	        	obj1.getToppings();
	        	//calling the toString()
	        	String reciept=obj1.toString();
	        	reciept="**********Reciept**********"+"\n"+"Name: "+name+"\n"+reciept;
	        	System.out.println(reciept);
	        }
	        else if(type.equalsIgnoreCase("feast")){
	        	Pizza obj1=new Feast(type,size);
	        	obj1.getToppings();
	        	//calling the toString()
	        	String reciept=obj1.toString();
	        	reciept="**********Reciept**********"+"\n"+"Name: "+name+"\n"+reciept;
	        	System.out.println(reciept);	
	       }
 


	}

}

