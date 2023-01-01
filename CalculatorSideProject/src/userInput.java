import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class userInput extends JFrame
{
private int mortgagePercentage;
private int minimumScoreRequirement;

public userInput()
{
	super("Mortgage Calculator");
	initWindow();
	setSize(480, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void initWindow()
{
	JTextField textField = new JTextField("This is a text", 20);
	setLayout(new FlowLayout());
	add(textField);
}
public static void main(String[] args)
{
	new userInput().setVisible(true);
}
}
