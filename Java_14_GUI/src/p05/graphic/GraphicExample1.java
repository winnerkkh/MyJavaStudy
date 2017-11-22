package p05.graphic;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GraphicExample1 {
	public static void main(String[] args) {
		
	
	JFrame frame = new JFrame("자동차 프로그램");
	frame.setLocation(500,200);
	frame.setPreferredSize(new Dimension(400,300));
	
	Container contentPane = frame.getContentPane();
	
	CarDrawingPanel drawingPanel = new CarDrawingPanel();
	contentPane.add(drawingPanel);
	
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
	}
}
