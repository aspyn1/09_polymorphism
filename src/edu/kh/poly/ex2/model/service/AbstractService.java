package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractService {
	
	public void ex1() {
		
//		Animal animal = new Animal();
		// 추상 클래스를 객체화 할 시 오류남(Cannot instantiate the type Animal)
		
		// 클래스 : 객체의 속성, 기능을 정의한 것 (일종의 설계도)
		// 추상클래스 : 미완성 메소드를 포함한 클래스 (미완성 설계도)
		// -> 미완성 설계도로는 객체를 만들 수 없다! -> 오류발생
		
		// 해결방법 : Animal을 상속받아 미완성 부분을 구현한
		// 클래스를 이용해 객체 생성
		
		
		// 추상클래스를 상속받은 자식클래스 객체 생성
		Person p1 = new Person();
		
		p1.setName("홍길동");
		// 상속받은 기능 호출
		p1.setType("척추동물");
		p1.setEatType("잡식");
		
		// 오버라이딩한 메서드 호출
		p1.eat();
		p1.breath();
		p1.move();
		
		p1.toString();
		
		
		Fish f1 = new Fish();
		
		f1.eat();
		f1.breath();
		f1.move();
		
		f1.toString();
		
	}
	
	public void ex2() {
		// * 추상클래스와 다형성 + 바인딩
		
		// - 추상클래스는 객체로 만들 수 없다!
		// 하지만, "참조변수"로는 사용할 수 있다.
		
		// Animal a1 = new Animal(); -> X
		
		// 사람 -> 동물 / 물고기 -> 동물
		//Animal a1 = new Person(); -> O
		//Animal a2 = new Fish(); -> O
		
		// Animal 참조변수 배열선언 및 할당
		Animal[] arr = new Animal[2];
		
		arr[0] = new Person("사람", "잡식", "김사람");
		// Animal 부모 = Person 자식(다형성 중 업캐스팅)
		
		arr[1] = new Fish("물고기", "잡식");
		
		// 바인딩 확인
		for(int i = 0; i < arr.length; i++) {
			// arr[i] == Annimal 참조변수
			arr[i].eat();
			arr[i].breath();
			System.out.println(arr[i].toString());
			// edu.kh.poly.ex2.model.vo.Animal.toString() - 정적바인딩
			System.out.println("=============");
			
			// 프로그램 실행 시 
			// 참조하고 있는 자식 객체의 오버라이딩된 eat() 메소드 실행
			// - 동적 바인딩
			// -> 부모타입 참조변수로 메소드를 호출했지만
			// 자식타입의 오버라이딩된 메소드가 수행된다.
		}
				
	}

}
