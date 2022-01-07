package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {

		// 추상 클래스는 생성 될 수 없다. 
		//Computer c1 = new Computer();
		
		Computer c2 = new DeskTop();
		c2.display();
		
		//Computer c3 = new LapTop();
		
		Computer c4 = new MyLapTop();
		
		LapTop c5 = new MyLapTop();
		c5.display();
	
	}

}
