package DecoratorDesginPattern;

public class NonVegPizza implements Pizza{

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return " NON-Veg Pizza(250)";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500.00;
	}

}
