package jazzpizzastore;

import java.util.Scanner;

public class Feast extends Pizza implements PizzaPrice {

	public Feast(String type, String size) {
		super(type, size);
	}

	
	@Override
	public void getToppings() {
		 Scanner in = new Scanner(System.in);
		 
	        System.out.println("How many toppings would you like?");
	        int numToppings=in.nextInt();
	        while(numToppings<0 || numToppings>3) {
	        	System.out.println("How many toppings would you like?");
	        	numToppings=in.nextInt();
	        }
	        for(int i=0;i<numToppings;i++) 
	        {
	        	System.out.println("Enter the name of topping");
	        	String topNew=in.next();
	        	super.toppings.add(topNew);
	        }
	     in.close();
	     if(getSize().equalsIgnoreCase("small")) {
	    	 double total=PriceofSmallPizza(getPriceOfBasePizza()[0]);
	    	 double totalAfterTax=TaxOnPizza(total);
	    	 super.setTotalCost(totalAfterTax);
	     }
	     else if(getSize().equalsIgnoreCase("medium")) {
	    	 double total=PriceofSmallPizza(getPriceOfBasePizza()[1]);
	    	 double totalAfterTax=TaxOnPizza(total);
	    	 super.setTotalCost(totalAfterTax);
	     }
	     else if(getSize().equalsIgnoreCase("large")) {
	    	 double total=PriceofSmallPizza(getPriceOfBasePizza()[2]);
	    	 double totalAfterTax=TaxOnPizza(total);
	    	 super.setTotalCost(totalAfterTax);
	     }
		
	}

	@Override
	public double PriceofSmallPizza(double BasePriceSmall) {
		double total=getCostoftopping()*super.toppings.size()+BasePriceSmall;
		return total;
	}

	@Override
	public double PriceofMediumPizza(double BasePriceMedium) {
		double total=getCostoftopping()*super.toppings.size()+BasePriceMedium;
		return total;
	}

	@Override
	public double PriceofLargePizza(double BasePriceLarge) {
		double total=getCostoftopping()*super.toppings.size()+BasePriceLarge;
		return total;
	}

	@Override
	public double TaxOnPizza(double TotalCost) {
		return (12.0/100.0)*TotalCost+TotalCost;
	}


}

