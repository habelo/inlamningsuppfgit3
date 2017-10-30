package inlämningsuppgift3;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import inlämningsuppgift3.PanelSiffror;

public class Knappar extends JPanel{
	protected PanelSiffror siffra;
	public Knappar(PanelSiffror s) {
		siffra=s;
	}
	
	JPanel p0;
	JPanel p1 =new JPanel();
	JPanel p2 =new JPanel();
	JPanel p3 =new JPanel();
	JPanel p4 =new JPanel();
//	JPanel p5 =new JPanel();
//	JPanel p6 =new JPanel();
//	JPanel p7 =new JPanel();
//	JPanel p8 =new JPanel();
//	JPanel p9 =new JPanel();
//	JPanel p10 =new JPanel();
//	JPanel p11 =new JPanel();
//	JPanel p12 =new JPanel();
//	JPanel p13 =new JPanel();
//	JPanel p14 =new JPanel();
//	JPanel p15 =new JPanel();
	
	public void labelEtt(JFrame jf) {

		JButton jl = new JButton(PanelSiffror.ETT.toString());
		jl.setFont(new Font("vad här", Font.BOLD, 20));
		jl.setBorder(new EtchedBorder());
		jl.setPreferredSize(new Dimension(100, 50));
		p1.add(jl);
		jf.add(p1);
	}
	public void labelTvå(JFrame jf) {
		JButton jl = new JButton(PanelSiffror.TVÅ.toString());
		jl.setFont(new Font("vad här", Font.ITALIC, 12));
		jl.setBorder(new EtchedBorder());
		jl.setPreferredSize(new Dimension(100, 50));
		p2.add(jl);
		jf.add(p2);
	}
	public void labelTre(JFrame jf) {
		JButton jl = new JButton(PanelSiffror.TRE.toString());
		jl.setFont(new Font("vad här", Font.HANGING_BASELINE, 15));
		jl.setBorder(new EtchedBorder());
		jl.setPreferredSize(new Dimension(100, 50));
		p3.add(jl);
		jf.add(p3);
	}
	public void labelFyra(JFrame jf) {
		JButton jl = new JButton(PanelSiffror.FYRA.toString());
		jl.setFont(new Font("vad här", Font.BOLD, 20));
		jl.setBorder(new EtchedBorder());
		jl.setPreferredSize(new Dimension(100, 50));
		p4.add(jl);
		jf.add(p4);
	}
}
