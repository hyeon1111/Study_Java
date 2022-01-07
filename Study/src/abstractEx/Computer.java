package abstractEx;

public abstract class Computer {
	// 추상 클래스 - 상속을 하기위해 만든다.
	
	public void turnOn() {
		System.out.println("전등을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전등을 끕니다.");
	}
	
	// 추상 메서드 - 구현 코드 {body} 없음( 수행될 명령어 없음 ), 메서드를 선언만 
	// 현재 클래스 안에서 구현되야하지만 어떻게 구현해야 할 지 모르고, 상속받은 곳에서 구체적으로 구현해야 할 때 ( 하위 클래스에 위임 ) 
	public abstract void display();
	public abstract void typing();
	
}
