package AJou.ac.kr.yunha9701;

public class Laptop extends Product implements Networked, DataStorage{
	
	private double totalCapacity;
	private double usedCapacity;
	
	@Override
	public double getFreeCapacity(){
		return 1000000;
	}
	@Override
	public void format(){
		System.out.println("Laptop is formated ;)");
	}
	@Override
	public boolean isConnected(){
		return true;
	}
	
	@Override
	public double maxSpeed(){
		return 1000000;
	}
	
	@Override
	public String getName(){
		String Name = "Laptop";
		return "Laptop"; 
	}
	
	public double getTotalCapacity() {
		return totalCapacity;
	}
	public void setTotalCapacity(double totalCapacity) {

		if(totalCapacity>0)
			this.totalCapacity = totalCapacity;
	}
	
	
	public double getUsedCapacity() {
		return usedCapacity;
	}
	
	public void setUsedCapacity(double usedCapacity) {
		if(usedCapacity>0)
			this.usedCapacity = usedCapacity;
	}

}
