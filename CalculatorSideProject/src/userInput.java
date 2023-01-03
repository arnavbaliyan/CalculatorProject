//package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class userInput extends JFrame implements ActionListener 
{

private JButton calculate;
private JLabel downPayment;
private JLabel loanAmount;
private JLabel loanTerm;
private JLabel interestRate;
private JLabel numberOfMonths;
private JLabel payment;
private Container c;
private JTextField DPInput;
private JTextField LAInput;
private JTextField LTInput;
private JTextField IRInput;
private JTextField NOMInput;
private JTextField PaymentOutput;

public userInput() 
{
super("Loan Calculator");
initWindowComponents();
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private void initWindowComponents() 
{

Font font = new Font(Font.SANS_SERIF,  Font.BOLD, 21);
c = this.getContentPane();
c.setLayout(null);

calculate = new JButton("Calculate");
calculate.setSize(100,50);
calculate.setLocation(195,390);
c.add(calculate);
calculate.addActionListener(this);


downPayment = new JLabel("Down Payment");
downPayment.setSize(200,100);
downPayment.setFont(font);
c.add(downPayment);

loanAmount = new JLabel("Loan Amount");
loanAmount.setSize(200,100);
loanAmount.setLocation(0,60);
loanAmount.setFont(font);
c.add(loanAmount);

loanTerm = new JLabel("Loan Term");
loanTerm.setSize(200,100);
loanTerm.setLocation(0,120);
loanTerm.setFont(font);
c.add(loanTerm);

interestRate = new JLabel("Interest Rate");
interestRate.setSize(200,100);
interestRate.setLocation(0,180);
interestRate.setFont(font);
c.add(interestRate);

numberOfMonths = new JLabel("Months");
numberOfMonths.setSize(200,100);
numberOfMonths.setLocation(0,240);
numberOfMonths.setFont(font);
c.add(numberOfMonths);

payment = new JLabel("Payment:");
payment.setSize(100,100);
payment.setLocation(100,300);
payment.setFont(font);
c.add(payment);

//Text field box for Down Payment input
 DPInput = new JTextField(20);
DPInput.setBounds(260,40,165,25);
c.add(DPInput);

// Text field box for Loan Amount input
LAInput = new JTextField(20);
LAInput.setBounds(260,100,165,25);
c.add(LAInput);

//Text field for Loan Term input
LTInput = new JTextField(20);
LTInput.setBounds(260,160,165,25);
c.add(LTInput);

//Text field for Interest Rate input
IRInput = new JTextField(20);
IRInput.setBounds(260,220,165,25);
c.add(IRInput);

//Text field for Number of Months Input.
NOMInput = new JTextField(20);
NOMInput.setBounds(260,280,165,25);
c.add(NOMInput);

PaymentOutput = new JTextField(20);
PaymentOutput.setBounds(197,340,165,25);
PaymentOutput.setEditable(false);
c.add(PaymentOutput);

}

public void actionPerformed(ActionEvent evt) 
{
	int downPayment = Integer.parseInt(DPInput.getText());
	double interestRate = Double.parseDouble(IRInput.getText());
	int timePeriod= Integer.parseInt(NOMInput.getText());
	System.out.println("Payment: "+Calculator.monthlyMortgagePayment(downPayment,interestRate,timePeriod));
}

public static void main(String[] args) 
{	
new userInput().setVisible(true);
}


}

