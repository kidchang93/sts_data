package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	@Qualifier("sony")
	@Autowired
	private	Speaker speaker ;
	
	@Override
	public void powerOn() {
		System.out.println("LgTV--전원을 켠다.");
	}
		
	@Override
	public void powerOff() {
		System.out.println("LgTV--전원을 끈다.");
		
	}
	@Override
	public void volumeUp() {
		System.out.println("LgTV--소리를 올린다.");
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV--소리를 내린다.");
		speaker.volumeDown();
	}
	
}
