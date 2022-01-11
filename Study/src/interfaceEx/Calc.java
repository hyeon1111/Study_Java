package interfaceEx;

public interface Calc {
	
	// 인터페이스에는 상수와 추상메서드가 선언된다.
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void descriptioin() {
		System.out.println("점수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i :arr) {
			total += i;
		}		
		return total;
	}
	
	
}
