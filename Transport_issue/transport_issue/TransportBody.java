package transport_issue;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TransportBody implements ActionListener{
	JFrame body = new JFrame();
	GridLayout main = new GridLayout(0,2);
	JTextField Row11 = new JTextField("Podaj popyt pierwszego odbiorcy");
	JTextField Row12 = new JTextField();
	JTextField Row21 = new JTextField("Podaj popyt drugiego odbiorcy");
	JTextField Row22 = new JTextField();
	JTextField Row31 = new JTextField("Podaj popyt trzeciego odbiorcy");
	JTextField Row32 = new JTextField();
	JTextField Row41 = new JTextField("Podaj podaż pierwszego dostawcy:");
	JTextField Row42 = new JTextField();
	JTextField Row51 = new JTextField("Podaj podaż drugiego dostawcy:");
	JTextField Row52 = new JTextField();
	JTextField Row61 = new JTextField("Podaj podaż trzeciego dostawcy:");
	JTextField Row62 = new JTextField();
	JTextField Row71 = new JTextField("Podaj jednostkowy koszt transportu x11:");
	JTextField x11 = new JTextField();
	JTextField Row81 = new JTextField("Podaj jednostkowy koszt transportu x12:");
	JTextField x12 = new JTextField();
	JTextField Row91 = new JTextField("Podaj jednostkowy koszt transportu x13:");
	JTextField x13 = new JTextField();
	JTextField Row101 = new JTextField("Podaj jednostkowy koszt transportu x21:");
	JTextField x21 = new JTextField();
	JTextField Row111 = new JTextField("Podaj jednostkowy koszt transportu x22:");
	JTextField x22 = new JTextField();
	JTextField Row121 = new JTextField("Podaj jednostkowy koszt transportu x23:");
	JTextField x23 = new JTextField();
	JTextField Row131 = new JTextField("Podaj jednostkowy koszt transportu x31:");
	JTextField x31 = new JTextField();
	JTextField Row141 = new JTextField("Podaj jednostkowy koszt transportu x32:");
	JTextField x32 = new JTextField();
	JTextField Row151 = new JTextField("Podaj jednostkowy koszt transportu x33:");
	JTextField x33 = new JTextField();
	JButton submit = new JButton("Dalej");
	JTextArea output = new JTextArea("");
	
	
	public TransportBody() {
		body.setVisible(true);
		body.setSize(700, 700);
		body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		body.setTitle("Zagadnienie Transportowe");
		body.setLayout(main);
		body.add(Row11);
		body.add(Row12);
		body.add(Row21);
		body.add(Row22);
		body.add(Row31);
		body.add(Row32);
		body.add(Row41);
		body.add(Row42);
		body.add(Row51);
		body.add(Row52);
		body.add(Row61);
		body.add(Row62);
		body.add(Row71);
		body.add(x11);
		body.add(Row81);
		body.add(x12);
		body.add(Row91);
		body.add(x13);
		body.add(Row101);
		body.add(x21);
		body.add(Row111);
		body.add(x22);
		body.add(Row121);
		body.add(x23);
		body.add(Row131);
		body.add(x31);
		body.add(Row141);
		body.add(x32);
		body.add(Row151);
		body.add(x33);
		body.add(submit);
		submit.addActionListener(this);
		body.add(output);
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int Row12P = Integer.parseInt(Row12.getText());
		int Row22P = Integer.parseInt(Row22.getText());
		int Row32P = Integer.parseInt(Row32.getText());
		int Row42P = Integer.parseInt(Row42.getText());
		int Row52P = Integer.parseInt(Row52.getText());
		int Row62P = Integer.parseInt(Row62.getText());
		int x11P = Integer.parseInt(x11.getText());
		int x12P = Integer.parseInt(x12.getText());
		int x13P = Integer.parseInt(x13.getText());
		int x21P = Integer.parseInt(x21.getText());
		int x22P = Integer.parseInt(x22.getText());
		int x23P = Integer.parseInt(x23.getText());
		int x31P = Integer.parseInt(x31.getText());
		int x32P = Integer.parseInt(x32.getText());
		int x33P = Integer.parseInt(x33.getText());
		
		
		for(int i=0; Row12P<=0 && Row22P<=0 && Row32P<=0 && Row42P<=0 && Row52P<=0 && Row62P<=0; i++) {
			
			int firstComparision = Math.min(x11P, x12P);
			int secondComparision = Math.min(x13P, x21P);
			int thirdComparision = Math.min(x22P, x23P);
			int fourthComparision = Math.min(x31P, x32P);
			int fifthComparision = Math.min(firstComparision, secondComparision);
			int sixthComparision = Math.min(thirdComparision, fourthComparision);
			int seventhComparision = Math.min(fifthComparision, sixthComparision);
			int eighthComparision = Math.min(seventhComparision, x33P);
			
			
		}
		
		
		
	}


}
