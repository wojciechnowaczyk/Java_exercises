package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea();
	
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");
	JButton buttonadd = new JButton("+");
	JButton buttonsub = new JButton("-");
	JButton buttonmul = new JButton("*");
	JButton buttondiv = new JButton("/");
	JButton buttonclear = new JButton("<-");
	JButton buttondot = new JButton(".");
	JButton buttonequal = new JButton("=");
	
	double number1, number2, result;
	int addc=0, mulc=0, divc=0, subc=0;
	public calculator() {
		frame.setSize(340, 450);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
		panel.setBorder(border);
		
		
		panel.add(textarea);
		textarea.setBackground(Color.WHITE);
		Border tborder = BorderFactory.createLineBorder(Color.BLACK, 3);
		textarea.setBorder(tborder);
		Font font = new Font ("arial", Font.BOLD, 33);
		textarea.setFont(font);
		textarea.setForeground(Color.BLACK);
		textarea.setPreferredSize(new Dimension(300,50));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,42));
		button2.setPreferredSize(new Dimension(100,42));
		button3.setPreferredSize(new Dimension(100,42));
		button4.setPreferredSize(new Dimension(100,42));
		button5.setPreferredSize(new Dimension(100,42));
		button6.setPreferredSize(new Dimension(100,42));
		button7.setPreferredSize(new Dimension(100,42));
		button8.setPreferredSize(new Dimension(100,42));
		button9.setPreferredSize(new Dimension(100,42));
		button0.setPreferredSize(new Dimension(100,42));
		buttonadd.setPreferredSize(new Dimension(100,42));
		buttonsub.setPreferredSize(new Dimension(100,42));
		buttonmul.setPreferredSize(new Dimension(100,42));
		buttondiv.setPreferredSize(new Dimension(100,42));
		buttonclear.setPreferredSize(new Dimension(100,42));
		buttondot.setPreferredSize(new Dimension(100,42));
		buttonequal.setPreferredSize(new Dimension(200,42));
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonadd);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttonclear);
		panel.add(buttondot);
		panel.add(buttonequal);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonadd.addActionListener(this);
		buttonsub.addActionListener(this);
		buttonmul.addActionListener(this);
		buttondiv.addActionListener(this);
		buttonclear.addActionListener(this);
		buttondot.addActionListener(this);
		buttonequal.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource(); 
		
		if(source == button1) {
			textarea.append("1");
		}
		if(source == button2) {
			textarea.append("2");
		}
		if(source == button3) {
			textarea.append("3");
		}
		if(source == button4) {
			textarea.append("4");
		}
		if(source == button5) {
			textarea.append("5");
		}
		if(source == button6) {
			textarea.append("6");
		}
		if(source == button7) {
			textarea.append("7");
		}
		if(source == button8) {
			textarea.append("8");
		}
		if(source == button9) {
			textarea.append("9");
		}
		if(source == button0) {
			textarea.append("0");
		}if(source == buttondot) {
			textarea.append(".");
		}
		
		if(source==buttonadd)
		{
			number1=number_reader();
			textarea.setText("");
			addc=1;
			divc=0;
			mulc=0;
			subc=0;
		}
		if(source==buttonsub)
		{
			number1=number_reader();
			textarea.setText("");
			addc=0;
			divc=0;
			mulc=0;
			subc=1;
		}
		if(source==buttondiv)
		{
			number1=number_reader();
			textarea.setText("");
			addc=0;
			divc=1;
			mulc=0;
			subc=0;
		}
		if(source==buttonmul)
		{
			number1=number_reader();
			textarea.setText("");
			addc=0;
			divc=0;
			mulc=1;
			subc=0;
		}
		
		if(source==buttonclear) {
			textarea.setText("");
		}
		
		if(source==buttonequal) {
			number2 = number_reader();
			
			if(addc==1) {
				result = number1 + number2;
				textarea.setText(Double.toString(result));
			}
			if(subc==1) {
				result = number1 - number2;
				textarea.setText(Double.toString(result));
			}
			if(mulc==1) {
				result = number1 * number2;
				textarea.setText(Double.toString(result));
			}
			if(divc==1) {
				result = number1 / number2;
				textarea.setText(Double.toString(result));
			}
		}
		
	}
	public double number_reader() {
		double num1;
		String s;
		s=textarea.getText();
		num1=Double.valueOf(s);
		return num1;
	}
}
