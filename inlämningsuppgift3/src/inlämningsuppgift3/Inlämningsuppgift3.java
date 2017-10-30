package inlämningsuppgift3;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.*;

public class Inlämningsuppgift3 extends JFrame{
	GridLayout gl = new GridLayout(4, 4);
//	Knappar[][] arrayen = new Knappar[2][2];
//	Knappar k = new Knappar(PanelSiffror.ETT);
	int[][] arr = new int[4][4];

	
	public Inlämningsuppgift3() {
		int count = 0;
		for(int j1 = 0; j1<arr.length; j1++)
		for (int i2 = 0; i2 < arr.length; i2++) {
			arr[j1][i2]=count;
			count++;
			System.out.println(arr[j1][i2]);
		}
		for(int j = 0; j<arr.length; j++)
			for (int i = 0; i < arr.length; i++) {
				int temp = arr[j][i];
				JButton jl = new JButton(""+temp);
				jl.setFont(new Font("vad här", Font.BOLD, 20));
				jl.setBorder(new EtchedBorder());
				jl.setPreferredSize(new Dimension(100, 50));
				add(jl);
			}
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(gl);
		setSize(new Dimension(800, 400));
//		k.labelEtt(this);
//		k.labelTvå(this);
//		k.labelTre(this);
//		k.labelFyra(this);
		
		
//		pack();
	}
	
	public static void main(String[] args) {
		Inlämningsuppgift3 start= new Inlämningsuppgift3();
	}
}
