package jazzpizzastore;
import java.util.ArrayList;

public abstract class Pizza {
	
    private static final double costOfTopping = 2.5;

// Price of Small, medium and large pizza is 10$, 12$ and 14$ respectively.
    
    private double[] PriceOfBasePizza = {10.00, 12.00, 14.00};
    private double TotalCost;
    private String type;
    
    protected ArrayList<String> toppings = new ArrayList<String>();
    private String size;

//Initializing the default constructor for this class.
    public Pizza() {
	}
    public Pizza(String type, String size) {
		
		this.type = type;
		this.size = size;
	}
	
	/* Generating Setters and getters for the variables required later  */
	public abstract void getToppings();
	public double[] getPriceOfBasePizza() {
		return PriceOfBasePizza;
	}
	public void setPriceOfBasePizza(double[] priceOfBasePizza) {
		PriceOfBasePizza = priceOfBasePizza;
	}
	public double getTotalCost() {
		return TotalCost;
	}
	public void setTotalCost(double totalCost) {
		TotalCost = totalCost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public static double getCostoftopping() {
		return costOfTopping;
	}
	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	//overriding the toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String reciept;
		
		reciept="Type of Pizza: "+type+"\n"+"Size of Pizza: "+size+"\n"+
				"Number of Toppings: "+toppings.size()+"\n"+
				"Cost Of Each Topping: $"+getCostoftopping()+"\n"
				;
		int c=1;
		for(String top :toppings) {
			reciept=reciept+"Topping "+c+":"+top+"\n";
			c++;
		}
		reciept=reciept+"Total Cost of Toppings: $"+getCostoftopping()*toppings.size()+"\n"+
				"Total Cost(Tax inclusive): $"+TotalCost+"\n";
		return reciept;
	}

	

}

