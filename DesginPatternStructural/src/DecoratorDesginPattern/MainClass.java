package DecoratorDesginPattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pizza order1= new VegPizza();
order1= new ChesseTopping(order1);
order1= new SpinachTopping(order1);
order1= new PannerTopping(order1);

System.out.println(order1.getDesc());
System.out.println(order1.getPrice());


	}

}
