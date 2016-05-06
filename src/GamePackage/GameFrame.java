package GamePackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameFrame extends JFrame implements KeypadObserver{
	private int frameHeight = 960;
	private int frameWidth = 960;
	private JLabel currentpose;
	ManIcon p;

	public GameFrame(ManIcon p){
		currentpose = p.getCharacterCurrentPose();
		currentpose.setBounds(0, 0,  50, 50);
		this.p = p;

		setLayout(null);
		add(currentpose);

		setSize(frameHeight,frameWidth);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void MoveCharacter(Dimension charDim){
		//ChangeCharacterPose(character_North);
		//this.CharacterCurrentPose = this.character_North;
		this.currentpose.setBounds(charDim.height, charDim.width, 32,32);
	}

	public void ChangeCharacterPose(JLabel newPose){
		this.currentpose = newPose;
	}

	public void updatePose(char chr) {
		Dimension dim = p.getCharDimension();
		System.out.println(dim);
		MoveCharacter(dim);
	}

}
