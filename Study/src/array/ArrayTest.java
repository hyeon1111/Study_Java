package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열 선언
		int[] number = new int[3];	
		
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		System.out.println("-----");

		// 배열 선언 방식 
		int number1[] = new int[10];
		
		int[]  number2;
		number1 = new int[3];
		
		int[]  number3 = {0, 1, 2};
				
		// 배열 초기화 할 때 [] 안에 개수 쓰면 오류!
		int[] numbers = new int[] {0, 1, 2};
		System.out.println(number.length);
	}

}
