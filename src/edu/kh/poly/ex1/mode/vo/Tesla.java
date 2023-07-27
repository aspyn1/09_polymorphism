package edu.kh.poly.ex1.mode.vo;

public class Tesla extends Car{ // 전기차
	
	private int batteryCapacity;// 배터리용량
	
	
	public Tesla() {}

	// alt + shift + s -> o -> 아래방향키 -> enter
	// 매개변수 생성자 + 상속받은 것도 포함
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}
	


	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override // Car.toString을 오버라이딩한 것
	public String toString() {
		return super.toString() + batteryCapacity;
	}
	
	

}
