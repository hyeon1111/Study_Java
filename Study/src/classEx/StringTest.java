package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class strClass = Class.forName("java.lang.String");
		
		// String 클래스의 모든 생성자 가져오기 getConstructors()
		Constructor[] cons = strClass.getConstructors();
		System.out.println("String 클래스의 모든 생성자 가져오기 : getConstructors()");
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		
		System.out.println("모든 멤버 변수(필드) 가져오기 : getFields()");
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		
		System.out.println("모든 메서드 가져오기 : getMethods()");
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		System.out.println();
		
	}

}
