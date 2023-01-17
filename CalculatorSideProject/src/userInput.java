import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userInput extends JFrame implements ActionListener{
	
  private JTextField ABInput;
  private JTextField IRInput;
  private JTextField NOYInput;
  private JTextField paymentOutput;
	/*
 	 * Constructor which initializes Calculator Window in GUI
	 */
	public userInput(){ 
	  super("Mortgage Calculator");
	  setSize(500,500);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  initWindowComponents();
	  setLayout(null);
	  setVisible(true);
	}
	/*
 	 * Initializes text boxes, labels, and buttons in the calculator window
	 */
	private void initWindowComponents(){ 
	  Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
	  Font boldFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);

	  //"Amount Borrowed" label 
	  JLabel principle = new JLabel("Amount Borrowed");
	  principle.setBounds(0,0,500,40);
	  principle.setFont(boldFont);
	  add(principle);
	  
	  //Text field box for Amount Borrowed input
	  ABInput = new JTextField();
	  ABInput.setBounds(0,40,235,40);
	  ABInput.setFont(font);
	  add(ABInput);

	  //"Interest Rate" label 
	  JLabel interestRate = new JLabel("Interest Rate");
	  interestRate.setBounds(0,90,500,40);
	  interestRate.setFont(boldFont);
	  add(interestRate);
	  
	  //Text field for Interest Rate input
	  IRInput = new JTextField();
	  IRInput.setBounds(0,130,235,40);
	  IRInput.setFont(font);
	  add(IRInput);

	  //"Years" label 
	  JLabel numberOfMonths = new JLabel("Years");
	  numberOfMonths.setBounds(0,180,500,40);
	  numberOfMonths.setFont(boldFont);
	  add(numberOfMonths);
	  
	  //Text field for Number of Years input
	  NOYInput = new JTextField();
	  NOYInput.setBounds(0,220,235,40);
	  NOYInput.setFont(font);
	  add(NOYInput);

	  //Button to calculate monthly payment 
	  JButton calculate = new JButton("Calculate");
	  calculate.setBounds(0,270,235,50);
	  add(calculate);
	  calculate.addActionListener(this);
 
	  //"Monthly Payment" label 
	  JLabel payment = new JLabel("Monthly Payment:");
	  payment.setBounds(0,330,500,40);
	  payment.setFont(boldFont);
	  add(payment);
	  
	  //Text field to display monthly payment
	  paymentOutput = new JTextField();
	  paymentOutput.setBounds(0,380,450,40);
	  paymentOutput.setEditable(false);
	  paymentOutput.setFont(font);
	  add(paymentOutput);
	  
	}
	/*
 	* Action event for when the calculate button is clicked
	* Does not allow values to be 0 or less than zero
	* An exception will also be thrown if values larger than the given
	* data types are entered
 	*/
	public void actionPerformed(ActionEvent evt){ 
	  try{
	    int principle = Integer.parseInt(ABInput.getText());
	    double interestRate = Double.parseDouble(IRInput.getText());
	    int timePeriod= Integer.parseInt(NOYInput.getText());
	    if(principle<=0
	       ||interestRate<=0.0
	       ||timePeriod<=0){
	      throw new NumberFormatException();
	    }
	    paymentOutput.setText(""+Calculator.monthlyMortgagePayment(principle,interestRate,timePeriod));
	  }catch (NumberFormatException nfe){
	    paymentOutput.setText("INVALID INPUT, TRY AGAIN");
	  }
	}
	//Calculator display is run
	public static void main(String[] args){ 
	  new userInput();
	} 
}
