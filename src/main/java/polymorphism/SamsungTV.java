package polymorphism;
 
public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV Constructor 1");
	}
	
//	public SamsungTV(Speaker speaker) {
//		System.out.println("SamsungTV Constructor 2");
//		this.speaker = speaker;
//	}
//	
//	public SamsungTV(Speaker speaker,int price) {
//		System.out.println("SamsungTV Constructor 3");
//		this.speaker = speaker;
//		this.price = price;
//	}
	
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker called");
		this.speaker = speaker;
	}
	
	
	public void setPrice(int price) {
		System.out.println("setPrice called");
		this.price = price;
	}
	
	public void initMethod1() {
		System.out.println("SamsingTV ---- initMethod");
	}

	public void destroyMethod2() {
		System.out.println("SamsungTV ---- DEstroy");
	}
	
	public void powerOn() {
		System.out.println("Samsung TV ---- Power ON 가격 ---:"+this.price+")");
	}
	
	public void powerOff() {
		System.out.println("Samsung TV ---- Power Off");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

	
	
	
	
}
