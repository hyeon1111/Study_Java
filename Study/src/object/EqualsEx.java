package object;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(studentID == std.studentID) {
				return true;
			}
			else {
				return false;
				}
		}
		return false;
	}

	public int hashCode() {
		return studentID;
	}
	
}// class_end



public class EqualsEx {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		// 주소 값 비교 
		System.out.println(str1 == str2);	// false -> 주소 값이 달라서
		
		// 문자열이 같은 지 체크
		System.out.println(str1.equals(str2));	// true -> 문자열이 같아서 
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);	// false
		System.out.println(std1.equals(std2));	//false -> equals 재정의 -> true
		
		System.out.println("==========");
		
		System.out.println(std1.hashCode());	// 1365202186 -> 10진수로 반환
		System.out.println(std2.hashCode());	// 1651191114
		System.out.println(System.identityHashCode(std2));	// 1651191114
		
		System.out.println("==========");

		
		// 3556498 -> 힙 메모리 위치 다르다
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
