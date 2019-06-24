

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class Calc {

	private JFrame frame;
	
	int num1 = 0;
	 int num2 = 0;
	 String op = "";
	 String l;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 330, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.getContentPane().setLayout(null);
		
			
		TextField line = new TextField();
		 line.setBounds(50, 30, 220, 25); 
		 
			JButton bC = new JButton("C");
			bC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					line.setText("");
				}
			});
			bC.setBounds(50, 240, 50, 50);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				line.setText(line.getText() + 0);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
			}
			}
		});
		b0.setBounds(105, 240, 50, 50);
		 
		 JButton b1 = new JButton("1");
		 b1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		 line.setText(line.getText() + 1);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 		 }
		 	}
		 });
		b1.setBounds(50, 185, 50, 50);
		 
		 JButton b2 = new JButton("2");
		 b2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		line.setText(line.getText() + 2);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 	}
		 	}	 
		 });
		 b2.setBounds(105, 185, 50, 50);
		 
		 JButton b3 = new JButton("3");
		 b3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		line.setText(line.getText() + 3);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 	}
		 	}
		 });
		 b3.setBounds(160, 185, 50, 50);
		 
		 JButton b4 = new JButton("4");
		 b4.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		line.setText(line.getText() + 4);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 	}
		 	}
		 });
		 b4.setBounds(50, 130, 50, 50);
		 
		 JButton b5 = new JButton("5");
		 b5.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		line.setText(line.getText() + 5);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 	}
		 	}
		 });
		 b5.setBounds(105, 130, 50, 50);
		 
		 JButton b6 = new JButton("6");
		 b6.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		line.setText(line.getText() + 6);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 	}
		 	}
		 });
		 b6.setBounds(160, 130, 50, 50);
		 
		 JButton b7 = new JButton("7");
		 b7.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		line.setText(line.getText() + 7);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 	}
		 	}
		 });
		 b7.setBounds(50, 75, 50, 50);
		 
		 JButton b8 = new JButton("8");
		 b8.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		line.setText(line.getText() + 8);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 	}
		 	}
		 });
		 b8.setBounds(105, 75, 50, 50);
		 
		 JButton b9 = new JButton("9");
		 b9.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		line.setText(line.getText() + 9);
		 		 if (num1==0) {
		 		 num1 = Integer.valueOf(line.getText());
		 		 } else {
		 		 num2 = Integer.valueOf(line.getText());
		 	}
		 	}
		 });
		 b9.setBounds(160, 75, 50, 50);
		 
		 JButton bResult = new JButton("=");
		 bResult.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		 line.setText(line.getText() + "=");
		 		 
		 		int nu1 = Integer.valueOf(num1);
		 		 int nu2 = Integer.valueOf(num2);
		 		 String strOp = op;

		 		 String strRes = String.valueOf(calc(nu1, strOp, nu2 ));
		 		 line.setText(strRes);
		 		 

		 	}
		 });
		 bResult.setBounds(160, 240, 50, 50);
		 bResult.setFont(new Font("Tahoma", Font.PLAIN, 11));
		 
		 JButton bPlus = new JButton("+");
		 bPlus.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		num1 = Integer.valueOf(line.getText());
		 		 line.setText(line.getText() + "+");
		 		 line.setText("");
		 		 op = "+";
		 	}
		 });
		 bPlus.setBounds(220, 75, 50, 50);
		 bPlus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		 
		 JButton bMinus = new JButton("-");
		 bMinus.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		num1 = Integer.valueOf(line.getText());
		 		 line.setText(line.getText() + "-");
		 		line.setText("");
		 		 op = "-";
		 	}
		 });
		 bMinus.setBounds(220, 130, 50, 50);
		 bMinus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		 
		 JButton bMulti = new JButton("*");
		 bMulti.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		num1 = Integer.valueOf(line.getText());
		 		 line.setText(line.getText() + "*");
		 		line.setText("");
		 		 op = "*";
		 	}
		 });
		 bMulti.setBounds(220, 185, 50, 50);
		 bMulti.setFont(new Font("Tahoma", Font.PLAIN, 17));
		 
		 JButton bDivision = new JButton("/");
		 bDivision.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		num1 = Integer.valueOf(line.getText());
		 		 line.setText(line.getText() + "/");
		 		line.setText("");
		 		 op = "/";
		 	}
		 });
		 bDivision.setBounds(220, 240, 50, 50);
		 

		 
		 frame.getContentPane().add(line);
		 frame.getContentPane().add(bC);
		 frame.getContentPane().add(b0);
		 frame.getContentPane().add(b1);
		 frame.getContentPane().add(b2);
		 frame.getContentPane().add(b3);
		 frame.getContentPane().add(b4);
		 frame.getContentPane().add(b5);
		 frame.getContentPane().add(b6);
		 frame.getContentPane().add(b7);
		 frame.getContentPane().add(b8);
		 frame.getContentPane().add(b9);
		 frame.getContentPane().add(bResult);
		 frame.getContentPane().add(bPlus);
		 frame.getContentPane().add(bMinus);
		 frame.getContentPane().add(bMulti);
		 frame.getContentPane().add(bDivision);
	}
		 catch (ArithmeticException exception)
		 {
		 //System.out.println("Can not divide by zero ");
		 }
	}
	


	public int calc ( int n1, String op, int n2) 
	 {
	 int res = 0;
	 switch (op) 
	 {
	 case "+":
	 res = n1+n2;
	 break;
	 case "-":
	 res = n1-n2;
	 break;
	 case "*":
	 res = n1*n2;
	 break;
	 case "/":
	 res = n1/n2;
	 break;
	 default:
	 res = 0;
	 break;
	 }
	 return res;
	 }

	
}


 

