package AJou.ac.kr.yunha9701;


public class SmartTV extends Product implements Networked{

	private int channel;
	
	@Override
	public boolean isConnected() {
		return true;
	}

	@Override
	public double maxSpeed() {
		return 100;
	}
	
	@Override
	public String getName() {
		return "SmartTV";
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel > 0)
			this.channel = channel;
	}

}

