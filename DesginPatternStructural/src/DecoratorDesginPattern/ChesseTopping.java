package DecoratorDesginPattern;

public class ChesseTopping extends PizzaDecorator{
	private Pizza p;
	ChesseTopping(Pizza p1){
		this.p=p1;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice()+10.0;
	}

	public String getDesc() {
		return p.getDesc()+"Chesse(10)";
		
	}

}
