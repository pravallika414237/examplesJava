package prototypeDesgin;

public class ProductClass {

	
	private int productId;
	private String productName;
	private int productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductClass [getProductId()=" + getProductId() + ", getProductName()=" + getProductName()
				+ ", getProductPrice()=" + getProductPrice() + "]";
	}
	

}
