package DecoratorDesginPattern;

public class PannerTopping extends PizzaDecorator{
  
	private Pizza p;
	PannerTopping(Pizza p1){
		this.p=p1;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice()+50.0;
	}

	public String getDesc() {
		return p.getDesc()+"Panner(50)";
		
	}
	
}
