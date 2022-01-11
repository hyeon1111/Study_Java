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
		
		
	}

}
