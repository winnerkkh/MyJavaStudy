package p05.graphic;

import java.awt.Graphics;
import javax.swing.JPanel;

/* *
 * swing에서 JPanel을 상속받고 paint()메소드를 재정의 하여
 * 그래픽 그림
 *  - 호출하는 클래스에서는 CarDrawingPanel의 Paint()메소드가 호출되어 실행되어 그림이 그려짐.
 * */

public class CarDrawingPanel extends JPanel {
	@Override
	public void paint(Graphics g) {
		g.drawRect(100, 110, 200, 40);// 사각형 그리기drawRect(시작x,시작y,폭,높이);
		g.drawRect(150, 70, 100, 40);
		g.drawOval(125, 150, 30, 30);// (중심x,중심y,반지름 x,반지름y);
		g.drawOval(245, 150, 30, 30);
		g.drawLine(50, 180, 350, 180);
	}

}