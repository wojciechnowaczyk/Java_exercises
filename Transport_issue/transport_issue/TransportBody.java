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
		
		String x11P = x11.getText();
		output.append(x11P);
		
	}


}
