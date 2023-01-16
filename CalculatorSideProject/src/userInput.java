import java.awt.Font;
//import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class userInput extends JFrame implements ActionListener{
  //private static JFrame jFrameDisplay=new JFrame("Mortgage Calculator");
  private JTextField DPInput;
  //private JTextField LAInput;
  //private JTextField LTInput;
  private JTextField IRInput;
  private JTextField NOMInput;
  private JTextField PaymentOutput;
	/*
 	 * Constructor which initializes Calculator Window in GUI
	 */
	public userInput(){ 
	  super("Mortgage Calculator");
	  setSize(500,500);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  //setDefaultLookAndFeelDecorated(true);
	  initWindowComponents();
	  setLayout(null);
	  setVisible(true);
	}
	/*
 	 * Initializes text boxes and buttons in the Calculator Window
	 */
	private void initWindowComponents(){ 
	  Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
	  Font boldFont = new Font(Font.SANS_SERIF, Font.BOLD, 30);

	  int ySpacing=50; 
	  int boxWidth=235;
	  int boxHeight=boldFont.getSize();
	  Rectangle test = new Rectangle(0,ySpacing+boxHeight,boxWidth,boxHeight);

	  //"Amount Borrowed" label 
	  JLabel downPayment = new JLabel("Amount Borrowed");
	  downPayment.setBounds(0,ySpacing,500,boxHeight);
	  downPayment.setFont(boldFont);
	  add(downPayment);
	  //Text field box for Amount Borrowed input
	  DPInput = new JTextField();
	  //DPInput.setBounds(0,ySpacing+boxHeight,235,boxHeight);
	  DPInput.setBounds(test);
	  DPInput.setFont(font);
	  add(DPInput);

	  //"Interest Rate" label 
	  JLabel interestRate = new JLabel("Interest Rate");
	  interestRate.setBounds(0,ySpacing*3,500,boxHeight);
	  interestRate.setFont(boldFont);
	  add(interestRate);
	  //Text field for Interest Rate input
	  IRInput = new JTextField(20);
	  IRInput.setBounds(0,ySpacing*3+boxHeight,235,boxHeight);
	  add(IRInput);

	  //"Years" label 
	  JLabel numberOfMonths = new JLabel("Years");
	  numberOfMonths.setBounds(0,ySpacing*5,500,boxHeight);
	  numberOfMonths.setFont(boldFont);
	  add(numberOfMonths);
	  //Text field for Number of Years input
	  NOMInput = new JTextField(20);
	  NOMInput.setBounds(0,ySpacing*5+boxHeight,235,boxHeight);
	  add(NOMInput);

	  //Button to calculate monthly payment 
	  JButton calculate = new JButton("Calculate");
	  calculate.setBounds(0,360,100,boxHeight);
	  add(calculate);
	  calculate.addActionListener(this);
/*	  
	  //"Payment" label 
	  JLabel payment = new JLabel("Payment:");
	  //payment.setSize(100,100);
	  //payment.setLocation(100,250);
	  payment.setBounds(0,ySpacing*6,200,100);
	  payment.setFont(boldFont);
	  c.add(payment);
	  
	  //Text field to display monthly payment
	  PaymentOutput = new JTextField(10);
	  PaymentOutput.setBounds(xSpacing,ySpacing*7,165,25);
	  PaymentOutput.setEditable(false);
	  c.add(PaymentOutput);
	  */
	  
	}
	/*
 	* Action event for when the calculate button is clicked
 	*/
	public void actionPerformed(ActionEvent evt){ 
	  try{
	    int downPayment = Integer.parseInt(DPInput.getText());
	    double interestRate = Double.parseDouble(IRInput.getText());
	    int timePeriod= Integer.parseInt(NOMInput.getText());
	    if(downPayment<=0
	       ||interestRate<=0.0
	       ||timePeriod<=0){
	      throw new NumberFormatException();
	    }
	    PaymentOutput.setText(""+Calculator.monthlyMortgagePayment(downPayment,interestRate,timePeriod));
	  }catch (NumberFormatException nfe){
	    PaymentOutput.setText("INVALID INPUT, TRY AGAIN");
	  }
	}
	//Calculator display is run
	public static void main(String[] args){ 
	  new userInput();
	} 
}
