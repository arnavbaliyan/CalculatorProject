import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class userInput extends JFrame
{
private static int downPayment;
private static double interestRate;
private static int timePeriod;

public userInput()
{
	super("Mortgage Calculator");
	initWindow();
	setSize(480, 300);
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
