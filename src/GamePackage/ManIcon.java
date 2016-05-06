package GamePackage;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ManIcon implements KeypadObserver{

	private ImageIcon pers;
	private Dimension charPostion;
	private Dimension ImagesSize;
	
	private JLabel character_East = new JLabel(new ImageIcon("H:\\AoopGame\\AoopGame\\src\\Images\\character_East.png"));
	private JLabel character_North = new JLabel(new ImageIcon("H:\\AoopGame\\AoopGame\\src\\Images\\character_North.png"));
	private JLabel character_NorthEast = new JLabel(new ImageIcon("H:\\AoopGame\\AoopGame\\src\\Images\\character_NorthEast.png"));
	private JLabel character_NorthWest = new JLabel(new ImageIcon("H:\\AoopGame\\AoopGame\\src\\Images\\character_NorthWest.png"));
	private JLabel character_South = new JLabel(new ImageIcon("H:\\AoopGame\\AoopGame\\src\\Images\\character_South.png"));
	private JLabel character_SouthEast = new JLabel(new ImageIcon("H:\\AoopGame\\AoopGame\\src\\Images\\character_SouthEast.png"));
	private JLabel character_SouthWest = new JLabel(new ImageIcon("H:\\AoopGame\\AoopGame\\src\\Images\\character_SouthWest.png"));
	private JLabel character_West = new JLabel(new ImageIcon("H:\\AoopGame\\AoopGame\\src\\Images\\character_West.png"));
	private JLabel CharacterCurrentPose;
	
	public ManIcon(){
		pers = new ImageIcon("H:\\AoopGame\\AoopGame\\src\\player.png");
		charPostion = new Dimension(0,0);
		ImagesSize = new Dimension(32,32);
		CharacterCurrentPose = character_North;
	}

	public void SetNewPosition(int x, int y){
		this.charPostion = new Dimension(x, y);
		//return this.charPostion;
	}
	
	public Dimension getCharDimension(){
		return charPostion;
	}
	public JLabel getCharacterCurrentPose(){
		return this.CharacterCurrentPose;
	}

	@Override
	public void updatePose(char chr) {
		if(chr == 'w'){
			System.out.println("wwwwwwwww: " +chr);
			this.SetNewPosition(this.charPostion.height, this.charPostion.width);
		}
		if(chr == 'd'){
			System.out.println("ddddddddd: " +chr);
			this.SetNewPosition(this.charPostion.height, this.charPostion.width+1);
		}
		if(chr == 's'){
			System.out.println("ssssssss: " +chr);
			this.SetNewPosition(this.charPostion.height+1, this.charPostion.width);
		}
		if(chr == 'a'){
			System.out.println("aaaaaaaa: " +chr);
			this.SetNewPosition(this.charPostion.height, this.charPostion.width-1);
		}
		
		
		
	}

}
