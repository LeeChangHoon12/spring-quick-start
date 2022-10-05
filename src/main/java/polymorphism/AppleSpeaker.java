package polymorphism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("AppleSpeaker Constructor");
	}
	
	public void volumeUp() {
		System.out.println("appleSpeaker VolumeUp");
	}
	
	public void volumeDown() {
		System.out.println("appleSpeaker VolumeDown");
	}
	
	
	
}
