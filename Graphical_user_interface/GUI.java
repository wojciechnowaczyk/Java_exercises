import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI implements ActionListener {
	JButton przycisk;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI myInterface = new GUI();
		myInterface.Algorytmy();
		
		
	}
	
	public void Algorytmy() {
		JFrame ramka = new JFrame();
		przycisk = new JButton("Kliknij");
		
		przycisk.addActionListener(this);
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ramka.getContentPane().add(przycisk);
		
		ramka.setSize(300, 300);
		
		ramka.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		przycisk.setText("Kliknięte");
	}

}
