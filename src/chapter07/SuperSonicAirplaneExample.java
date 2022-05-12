package chapter07;

public class SuperSonicAirplaneExample {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		
	}
}
