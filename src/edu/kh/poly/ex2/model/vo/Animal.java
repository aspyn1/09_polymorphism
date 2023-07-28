package edu.kh.poly.ex2.model.vo;

public abstract class Animal {
	/* 추상 클래스(abstract class)
	 * 1. 미완성 메소드(추상 메소드)를 보유하고있는 클래스
	 * 2. 객체로 만들면 안되는 클래스 -> instance화 불가
	 * 		-> 여러타입들을 관리하기 위한 상위 타입의 목적이며,
	 * 			객체로 생성하여 사용하기 위한 목적이 아니다.
	 * 			-> 객체화 할 시 오류남(Cannot instantiate the type Animal)
	 * 
	 * 
	 */
	
	
	private String type; // 종, 과
	private String eatType; // 식성(초식, 육식, 잡식..)
	
	
	
	
	public Animal() {} // 기본생성자
	
	// 추상클래스는 new 연산자를 통해 직접적인 객체 생성은 불가능하지만
	// 상속받은 객체 생성 시 내부 부모부분이 생성될 때 사용된다.

	public Animal(String type, String eatType) { // 매개변수 생성자(오버로딩 적용)
		this.type = type;
		this.eatType = eatType;
	}
	
	


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getEatType() {
		return eatType;
	}


	public void setEatType(String eatType) {
		this.eatType = eatType;
	}

	
	// toString()오버라이딩
	@Override // 오버라이딩이 되었음을 컴파일러에게 알려주는 어노테이션
	public String toString() {
		return type + " / " + eatType;
	}
	
	
	// 동물의 공통 기능 추출(추상화)
	// -> 동물은 공통적으로 먹고, 숨쉬고, 움직이지만
	// 	  어떤 동물이냐에 따라 그 방법이 다름!
	// 		-> 해당 클래스에 메소드를 정의할 수 없다.
	// 		-> 미완성 상태로 두어 상속받은 자식클래스가 해당 메소드를 정의하도록 
	// 		-> 오버라이딩 강제화를 시켜야함 -> 추상메소드로 작성
	
	
	// 먹다
	public abstract void eat(); // - > 추상 메소드 -> 추상메소드만 작성하면 오류남
								// -> 해당 클래스도 추상클래스로 만들어줘야함
	
	// 숨쉬다
	public abstract void breath();
	
	// 움직이다
	public abstract void move();
	

	
	

}
