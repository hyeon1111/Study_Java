package genericEx;

public class Powder extends Material{

	public String toString() {
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료를 출력합니다.");
	}
}
