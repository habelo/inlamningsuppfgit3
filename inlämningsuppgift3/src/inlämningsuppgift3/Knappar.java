package inl�mningsuppgift3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Knappar extends JFrame implements ActionListener{
    
    JFrame f = new JFrame();
    JPanel p = new JPanel();
    JButton[][] knappar = new JButton[4][4];
    
    JButton r1 = new JButton("1");
    JButton r2 = new JButton("2");
    JButton r3 = new JButton("3");
    JButton r4 = new JButton("4");
    JButton r5 = new JButton("5");
    JButton r6 = new JButton("6");
    JButton r7 = new JButton("7");
    JButton r8 = new JButton("8");
    JButton r9 = new JButton("9");
    JButton r10 = new JButton("10");
    JButton r11 = new JButton("11");
    JButton r12 = new JButton("12");
    JButton r13 = new JButton("13");
    JButton r14 = new JButton("14");
    JButton r15 = new JButton("15");
    JButton r16 = new JButton("16");
    JButton startKnapp = new JButton("Start");
    
    int a1 = 0;                                 // Tomma knappens y
    int a2 = 0;                                 // Tomma knappens x
    int b1 = 0;                                 // Klickade knappens y
    int b2 = 0;                                 // Klickade knappens x
        
    
    public Knappar(){
        
        knappar[0][0] = r1;
        knappar[0][1] = r2;
        knappar[0][2] = r3;
        knappar[0][3] = r4;
        knappar[1][0] = r5;
        knappar[1][1] = r6;
        knappar[1][2] = r7;
        knappar[1][3] = r8;
        knappar[2][0] = r9;
        knappar[2][1] = r10;
        knappar[2][2] = r11;
        knappar[2][3] = r12;
        knappar[3][0] = r13;
        knappar[3][1] = r14;
        knappar[3][2] = r15;
        knappar[3][3] = r16;

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        r4.addActionListener(this);
        r5.addActionListener(this);
        r6.addActionListener(this);
        r7.addActionListener(this);
        r8.addActionListener(this);
        r9.addActionListener(this);
        r10.addActionListener(this);
        r11.addActionListener(this);
        r12.addActionListener(this);
        r13.addActionListener(this);
        r14.addActionListener(this);
        r15.addActionListener(this);
        r16.addActionListener(this);
        startKnapp.addActionListener(this);
        
        r16.setVisible(false);
        p.setLayout(new GridLayout(5, 4));
        shuffle(knappar);
        nyBräda();  
        add(p);
        
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void shuffle(JButton[][] lista){
        for(int i=0; i<lista.length; i++){
            for(int j=0; j<lista[i].length; j++){
                int x1 = (int) (Math.random() * lista.length);
                int x2 = (int) (Math.random() * lista[i].length);
                
                JButton temp = lista[i][j];
                lista[i][j] = lista[x1][x2];
                lista[x1][x2] = temp;
            }
        }
    }//shuffle
    
    public void nyBräda() {
    	p.add(knappar[0][0]);
        p.add(knappar[0][1]);
        p.add(knappar[0][2]);
        p.add(knappar[0][3]);
        p.add(knappar[1][0]);
        p.add(knappar[1][1]);
        p.add(knappar[1][2]);
        p.add(knappar[1][3]);
        p.add(knappar[2][0]);
        p.add(knappar[2][1]);
        p.add(knappar[2][2]);
        p.add(knappar[2][3]);
        p.add(knappar[3][0]);
        p.add(knappar[3][1]);
        p.add(knappar[3][2]);
        p.add(knappar[3][3]);
        p.add(startKnapp);
    }
    
    public void bytKnapp(JButton[][] inknappar, int x1, int y1, int x2, int y2) {

    	JButton[][] temp = new JButton[4][4];
    	temp[x1][y1] = inknappar[x1][y1];
    	temp[x2][y2] = inknappar[x2][y2];
    	inknappar[x1][y1] = temp[x2][y2];
    	inknappar[x2][y2] = temp[x1][y1];
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getActionCommand().equals("1")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("1")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("2")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("2")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("3")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("3")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("4")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("4")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("5")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("5")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("6")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("6")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("7")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("7")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("8")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("8")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("9")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("9")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("10")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("10")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("11")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("11")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("12")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("12")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("13")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("13")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("14")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("14")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        if(ae.getActionCommand().equals("15")) {
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("15")){
                        b1 =i;								//här kollar man och sparar arrayens index för "1" så att man sedan kan byta knapp
                        b2 =j;                                                          //b1 och b2 indexet för där "1" ligger i arrayen så det är de man skickar in
                    }
                }
            }
            for(int i=0; i<knappar.length; i++){
                for(int j=0; j<knappar[i].length; j++){
                    if(knappar[i][j].getText().equals("16")){
                        a1 = i;
                        a2 = j;
                    }
                }
            }
            if(okAttByta() == true){
                bytKnapp(knappar, b1, b2, a1, a2);
            }
            if(vunnit(knappar) == true){
            grattisMeddelande();
            }
        }
        
        if(ae.getActionCommand().equals("Start"))
      	shuffle(knappar);
	
        p.removeAll();
        p.repaint();
        p.revalidate();
        nyBräda();
    }

    public boolean okAttByta(){
        if((b1==a1+1 && b2==a2) || (b1==a1-1 && b2==a2) || (b2==a2+1 && b1==a1) || (b2==a2-1 && b1==a1))
            return true;
        else
            return false;
    }
    public boolean vunnit(JButton[][] lista){
        if(lista[0][0].getText().equals("1") &&
        lista[0][1].getText().equals("2") &&
        lista[0][2].getText().equals("3") &&
        lista[0][3].getText().equals("4") &&
        lista[1][0].getText().equals("5") &&
        lista[1][1].getText().equals("6") &&
        lista[1][2].getText().equals("7") &&
        lista[1][3].getText().equals("8") &&
        lista[2][0].getText().equals("9") &&
        lista[2][1].getText().equals("10") &&
        lista[2][2].getText().equals("11") &&
        lista[2][3].getText().equals("12") &&
        lista[3][0].getText().equals("13") &&
        lista[3][1].getText().equals("14") &&
        lista[3][2].getText().equals("15") &&
        lista[3][3].getText().equals("16"))
            return true;
        else
            return false;
    }
    public void grattisMeddelande(){
        JOptionPane.showMessageDialog(null, "Grattis, du har vunnit!! xD");
    }
    
}
