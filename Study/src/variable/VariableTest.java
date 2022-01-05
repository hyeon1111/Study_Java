package variable;

public class VariableTest {

	// 변수 선언하고 값 대입하기
	public static void main(String[] args) {
		
		int level;	// 정수형 변수 level 선언
		level = 10; // level 변수에 값 10 대입
		System.out.println("level : " + level);	// level 값 출력
		
		
		// 변수 선언할 때 변수 값을 바로 대입( 초기화 )
		int age = 25;
		System.out.println("age : " +  age);

		// 변수 : 변하는 값
		
		// 상수 : 변하지 않는 값, 값을 변경할 수 없다, final
		final int max_num = 100;
	}

}
