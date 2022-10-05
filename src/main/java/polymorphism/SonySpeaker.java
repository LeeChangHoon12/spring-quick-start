package polymorphism;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("--->sonySpeaker constructor");
	}
	
	public void volumeUp() {
		System.out.println("--->sony speaker volume up");
	}
	

	public void volumeDown() {
		System.out.println("--->sony speaker volume Down");
	}
}
