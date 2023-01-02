//package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class userInput extends JFrame {

//private JFrame window;
private JButton calculate;
private JLabel downPayment;
private JLabel loanAmount;
private JLabel loanTerm;
private JLabel interestRate;
private JLabel numberOfMonths;
private Container c;
Font font = new Font(Font.SANS_SERIF,  Font.BOLD, 25);

public userInput() {
super("Loan Calculator");
initComponents();
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void initComponents() {

c = this.getContentPane();
c.setLayout(null);

calculate = new JButton("Calculate");
calculate.setSize(100,50);
calculate.setLocation(195,375);
c.add(calculate);

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

numberOfMonths = new JLabel("Interest Rate");
numberOfMonths.setSize(200,100);
numberOfMonths.setLocation(0,240);
numberOfMonths.setFont(font);
c.add(numberOfMonths);

//Text field box for Down Payment input
JTextField DPInput = new JTextField(20);
DPInput.setBounds(260,40,165,25);
c.add(DPInput);

// Text field box for Loan Amount input
JTextField LAInput = new JTextField(20);
LAInput.setBounds(260,100,165,25);
c.add(LAInput);

//Text field for Loan Term input
JTextField LTInput = new JTextField(20);
LTInput.setBounds(260,160,165,25);
c.add(LTInput);

//Text field for Interest Rate input
JTextField IRInput = new JTextField(20);
IRInput.setBounds(260,220,165,25);
c.add(IRInput);

//Text field for Number of Months Input.
JTextField NOMInput = new JTextField(20);
NOMInput.setBounds(260,280,165,25);
c.add(NOMInput);
}

public static void main(String[] args) {
new userInput().setVisible(true);
	}

}

// previous code.
/*
public class userInput extends JFrame
{
<<<<<<< HEAD
//private int mortgagePercentage;
//private int minimumScoreRequirement;
=======
private static int downPayment;
private static double interestRate;
private static int timePeriod;
>>>>>>> branch 'main' of https://github.com/arnavbaliyan/CalculatorProject.git

public userInput()
{
	super("Mortgage Calculator");
	initWindow();
	setSize(500, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void initWindow()
{
	JTextField textField = new JTextField(20);
	setLayout(new FlowLayout());
	add(textField);
}
public static int getDownPayment()
{
	return downPayment;
}
public static double getInterestRate()
{
	return interestRate;
}
public static int getTimePeriod()
{
	return timePeriod;
}

public static void main(String[] args)
{
	new userInput().setVisible(true);
}
}
*/
