package polymorphism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;


@Component("tv")
public class LgTV implements TV{

	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("lgTV 생성 ");
	}
	public void powerOn() {
		System.out.println("LgTV -- Trun on");
	}
	
	public void powerOff() {
		System.out.println("LgTV -- Trun off");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("LgTV -- Sound up");
	}
	

	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("LgTV -- Sound Down");
	}
	
}