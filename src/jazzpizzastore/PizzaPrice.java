package jazzpizzastore;

public interface PizzaPrice {
	public double PriceofSmallPizza(double BasePriceSmall);
	public double PriceofMediumPizza(double BasePriceMedium);
	public double PriceofLargePizza(double BasePriceLarge);
    public double TaxOnPizza(double TotalCost);

}
