package test;

public class Tv {
	
	public Tv() {
		
	}
	
	public Tv(int channel, int volume) {
		this.channel = channel;
		this.volume = volume;
	}
	
	private int channel;
	private int volume;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + "]";
	}
	
	
	
}
