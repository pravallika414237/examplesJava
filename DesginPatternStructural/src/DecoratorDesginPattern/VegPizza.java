package DecoratorDesginPattern;

public class VegPizza implements Pizza {
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return " Veg Pizza(250)";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 300.00;
	}
}
/*
 add items
 panner 50
 chesse  20
 meat  100
 olive  20
 */