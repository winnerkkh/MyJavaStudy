package test_171108.interfaces;

public class Unit {
	int hitPoint; 
	final int MAX_HP; 

	Unit(int hp) {
		MAX_HP = hp;
	}
}

interface Repairable {
	
}

interface Recovery {
	
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
}


class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}

