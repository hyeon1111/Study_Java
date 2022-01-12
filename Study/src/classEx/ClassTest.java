package classEx;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		
		// getClass 메서드 사용하기( object의 메서드 ) : 이미 생성된 인스턴스가 있어야 한다.
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());	// classEx.Person
		
		// 직접 class 파일 대입하기
		Class pClass2 = Person.class;	
		System.out.println(pClass2.getName());	// classEx.Person
		
		Class pClass3 = Class.forName("classEx.Person");
		System.out.println(pClass3.getName());	// classEx.Person
		
		Class pClass = Class.forName("java.lang.String");
		System.out.println(pClass.getName());
	}

}
