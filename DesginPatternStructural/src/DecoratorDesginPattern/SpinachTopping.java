package DecoratorDesginPattern;

public class SpinachTopping  extends PizzaDecorator {
	private Pizza p;
	SpinachTopping(Pizza p1){
		this.p=p1;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice()+30.0;
	}

	public String getDesc() {
		return p.getDesc()+"Spinach(30)";
		
	}

}
