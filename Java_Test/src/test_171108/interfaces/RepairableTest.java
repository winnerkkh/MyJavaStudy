package test_171108.interfaces;

import java.util.Scanner;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropShip = new DropShip();
		Marine marine = new Marine();
		Damaged att = new Damaged();
		att.attacked(tank);
		att.attacked(dropShip);
		att.attacked(marine);
		
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropShip);
		
		//객체 타입을 메딕으로 변경 
		Medic medic = new Medic();   
		//medic.repair(marine);
		 medic.recover(marine);
	}
}


//마린에 어울리는 치료방법은 Recover임 
//구현부를 Recover을 통하게 설계
class Marine extends GroundUnit implements Recovery { 
	
	Marine() {
		super(60);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return this.getClass().getSimpleName()+"hitPoint="+hitPoint;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				System.out.println(u.hitPoint++);
			}
			System.out.println();
			System.out.println(u.toString() + "의 수리가 막 끝났습니다.");
		}
	}
}

class Medic extends GroundUnit implements Recovery {

	Medic() {
		super(60); // 처음 만들어질때 생성되는 에너지의 값
		hitPoint = MAX_HP; // Max_Hp에 저장되어 있는 숫자를 변경하기위해 만든 임시 에너지 공간
	}

	 void recover(Recovery r) {
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			while (u.hitPoint != u.MAX_HP) {
				System.out.println(u.hitPoint++);
			}
			System.out.println();
			System.out.println(u.toString() + "의 치료가 막 끝났습니다.");
		}
	}

}


class Damaged{	
	void attacked(Unit u) {
		System.out.println();
		System.out.print("공격받은 hp를 입력하세요>");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		 int lowerHp = scanner.nextInt();
			while(u.hitPoint >lowerHp){
				System.out.print(u.hitPoint-- +"\t");
			}
			System.out.println();
			System.out.println(u.toString()+"의 hp가 "+u.hitPoint+"로 줄어들었습니다.");
		}
	}
