package prototypeDesgin;

import java.util.*;

public class ProductShop implements Cloneable {
//cloneable is markableinterface
	private String ShopName;
	
	List <ProductClass> product =
			new ArrayList<>();

	public String getShopName() {
		return ShopName;
	}

	public void setShopName(String shopName) {
		ShopName = shopName;
	}

	public List<ProductClass> getProduct() {
		return product;
	}

	public void setProduct(List<ProductClass> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductShop [ShopName=" + ShopName + ", product=" + product + "]";
	}
	
	public void addProducts() {
		for(int i=1;i<10; i++) {
			ProductClass p = new ProductClass();
			p.setProductId(i);
			
			getProduct().add(p);
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ProductShop shop = new ProductShop();
		//deep copy
		for(ProductClass p:this.getProduct()) {
			shop.getProduct().add(p);     
		}
		return shop;
		//return super.clone();  //shalowcopy
	}
	
	
	
}
