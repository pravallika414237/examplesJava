package prototypeDesgin;

public class ShopMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ProductShop shop1 = new ProductShop();
		shop1.setShopName("a1 shop");
		shop1.addProducts();
		

		// TODO Auto-generated method stub
		ProductShop shop2 = new ProductShop();
		shop2.setShopName("G shop");
		shop2.addProducts();
		System.out.println(shop2);

		ProductShop shop3 = (ProductShop) shop1.clone();
         shop3.setShopName("abc shop");
		
         shop1.getProduct().remove(2);
		System.out.println(shop1);
		System.out.println(shop3);
		
		
	}

}
