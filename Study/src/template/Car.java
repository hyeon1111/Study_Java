package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {}
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메소드 - 시나리오를 정의( 일련의 순서를 정해놓은 메서드 )
	// 메소드를 final 선언하면 하위 클래스에서 메서드 재정의 못한다.( 오버라이딩 하려고 하면 오류 )
	public final  void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
	
}
