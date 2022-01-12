package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");	
		System.out.println(str1 == str2);	// false -> 주소 값이 달라서
		
		String str3 = "abc";
		String str4 = "abc";		
		System.out.println(str3 == str4);	// true -> 문자열 상수 바로 가르키는 경우 주소 값이 같음
		
		System.out.println("==========");
		
		String javaStr = new String("Java");
		String androidStr = new String("Android");
		
		System.out.println(System.identityHashCode(javaStr));	// 1694819250
		System.out.println("==========");
		
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));	// 1365202186
		// 새로 문자열에 생성되어 주소 값이 달라진다. 
		
	}

}
