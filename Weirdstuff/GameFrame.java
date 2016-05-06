package Framework;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;



public class GameFrame{
	
	JFrame frame = new JFrame("lol");
	public GameFrame(){
		
		frame.getContentPane().setBackground(new Color(0,153,0));
		
		
		
		
		ImageIcon icon = new ImageIcon("C:/Users/Lolita/Desktop/AoopGame/EclipseProjekt/AoopProject/src/Framework/Muj.png","Njut");
		JLabel label = new JLabel(icon);
	
	    frame.setLayout(null);
	    label.setBounds(200, 100, 100, 100);

		
		int x=0;
		int y = 0;
        label.setLocation(x, y);
	
	
		
	    frame.add(label);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	
		 }



	

}
