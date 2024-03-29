package one;

import javax.swing.*;

public class One extends JFrame {
	One(){
		setTitle("집에 갈래");
		
		JButton b=new JButton();
		add(b);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new One();
		
	}

}
