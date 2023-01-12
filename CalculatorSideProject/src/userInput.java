import java.awt.Font;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class userInput extends JFrame implements ActionListener 
{
private JTextField DPInput;
private JTextField LAInput;
private JTextField LTInput;
private JTextField IRInput;
private JTextField NOMInput;
private JTextField PaymentOutput;
/*
 * Constructor which initializes Calculator Window in GUI
 */
public userInput() 
{
super("Loan Calculator");
initWindowComponents();
setSize(500,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
/*
 * Initializes textboxes and buttons in the Calculator Window
 */
private void initWindowComponents() 
{

Font font = new Font(Font.SANS_SERIF, Font.BOLD, 21);
Container c = this.getContentPane();
c.setLayout(null);

JButton calculate = new JButton("Calculate");
calculate.setSize(100,50);
calculate.setLocation(195,390);
c.add(calculate);
calculate.addActionListener(this);


JLabel downPayment = new JLabel("Down Payment");
downPayment.setSize(200,100);
downPayment.setFont(font);
c.add(downPayment);

JLabel loanAmount = new JLabel("Loan Amount");
loanAmount.setSize(200,100);
loanAmount.setLocation(0,60);
loanAmount.setFont(font);
c.add(loanAmount);

JLabel loanTerm = new JLabel("Loan Term");
loanTerm.setSize(200,100);
loanTerm.setLocation(0,120);
loanTerm.setFont(font);
c.add(loanTerm);

JLabel interestRate = new JLabel("Interest Rate");
interestRate.setSize(200,100);
interestRate.setLocation(0,180);
interestRate.setFont(font);
c.add(interestRate);

JLabel numberOfMonths = new JLabel("Months");
numberOfMonths.setSize(200,100);
numberOfMonths.setLocation(0,240);
numberOfMonths.setFont(font);
c.add(numberOfMonths);

JLabel payment = new JLabel("Payment:");
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
//Text field to display monthly payment
PaymentOutput = new JTextField(20);
PaymentOutput.setBounds(197,340,165,25);
PaymentOutput.setEditable(false);
c.add(PaymentOutput);

}
	/*
 	* Action event for when the calulate button is clicked
 	*/
	public void actionPerformed(ActionEvent evt){ 
	  int downPayment = Integer.parseInt(DPInput.getText());
	  double interestRate = Double.parseDouble(IRInput.getText());
	  int timePeriod= Integer.parseInt(NOMInput.getText());
	  PaymentOutput.setText(""+Calculator.monthlyMortgagePayment(downPayment,interestRate,timePeriod));
	}
	//Calculator display is run
	public static void main(String[] args){ 
	  new userInput().setVisible(true);
	}
}
