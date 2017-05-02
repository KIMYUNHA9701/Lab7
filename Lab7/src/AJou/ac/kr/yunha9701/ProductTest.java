package AJou.ac.kr.yunha9701;

public class ProductTest {
		
	public void testProduct(Product p){
		System.out.println("Product's name : "+ p.getName());
		System.out.println("Product's price : "+p.getPrice());
		
	}
	public void testDataStorage(DataStorage d){
		System.out.println("Datastorage capacity : "+d.getFreeCapacity());
		d.format();
	}
	public void testNetworked(Networked n){
		System.out.println("Is network connected? : "+n.isConnected());
		System.out.println("Network's max speed : "+n.maxSpeed());
	}
	public void testCooker(Cooker c){
		System.out.println("Cooker's prepare food : "+c.prepareFood());
	}
	
	
	public static void main(String[] args) {
		ProductTest pt=new ProductTest();

		SmartTV s=new SmartTV();
		s.setPrice(100000);
		s.setChannel(11);
		
		Toaster t = new Toaster();
		t.setPrice(20000);
		
		Laptop l = new Laptop();
		l.setPrice(500000);
		l.setTotalCapacity(1000);
		l.setUsedCapacity(988);
		
				
		pt.testProduct(s);
		pt.testNetworked(s);
		System.out.println();
		
		pt.testProduct(t);
		pt.testCooker(t);
		System.out.println();
		
		pt.testProduct(l);
		pt.testDataStorage(l);
		pt.testNetworked(l);
		System.out.println();
	}
}


