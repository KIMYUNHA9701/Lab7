package AJou.ac.kr.yunha9701;

public abstract class Product {
 private double price;

public double getPrice() {
	return price;
}
public void setPrice(double Price) {
	if(Price != 0){
		price=Price;
	}
}
  public abstract String getName();
}
