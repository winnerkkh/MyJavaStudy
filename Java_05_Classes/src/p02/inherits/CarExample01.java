package p02.inherits;

public class CarExample01 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println("탑승인원= " + bus.a);
		bus.move();
		
		Ambulance ambulance = new Ambulance();
		ambulance.move();
		ambulance.special();
		
		FireEngine fireEngine = new FireEngine();
		fireEngine.move();
	}
}
