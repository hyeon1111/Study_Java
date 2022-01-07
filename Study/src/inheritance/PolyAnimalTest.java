package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

// 다형성 - 동일 메소드 호출, but 다양한 구현 
public class PolyAnimalTest {

	public static void main(String[] args) {

		PolyAnimalTest test = new PolyAnimalTest();
		
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		System.out.println("====================");
		
		Animal[] animalList = new Animal[3];
		animalList[0] =  new Human();
		animalList[0].move();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		animals.get(0).move();
	}

	private void moveAnimal(Animal animal) {	// Animal animal = new Human(); 과 같다.
		
		animal.move();
		
		// 다운캐스팅을 잘못 쓴 경우 
		//Human human = (Human) animal;
		//human.readBook();
				
		if( animal instanceof Human ) {
			Human human = (Human) animal;
			human.readBook();
			System.out.println("====================");
		}		
		else if( animal instanceof Tiger ) {
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
			System.out.println("====================");
		}		
		else if( animal instanceof Eagle ) {
			Eagle eagle = (Eagle) animal;
			eagle.flying();
		}
		
	}

}
