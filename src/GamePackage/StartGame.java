package GamePackage;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;



public class StartGame {
	

	public static void main(String[] args) {
		
		ManIcon p = new ManIcon();
		GameFrame f = new GameFrame(p);

		f.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyChar());
				p.updatePose(e.getKeyChar());
				f.updatePose(e.getKeyChar());

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}




}
