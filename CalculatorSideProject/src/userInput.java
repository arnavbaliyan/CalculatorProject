import java.awt.Font;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class userInput extends JFrame implements ActionListener{
  private JTextField DPInput;
  private JTextField LAInput;
  private JTextField LTInput;
  private JTextField IRInput;
  private JTextField NOMInput;
  private JTextField PaymentOutput;
	/*
 	 * Constructor which initializes Calculator Window in GUI
	 */
	public userInput(){ 
	  super("Loan Calculator");
	  setSize(470,470);
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
	  Font font = new Font(Font.SANS_SERIF, Font.BOLD, 21);
	  //Container c = this.getContentPane();
	  //c.setLayout(null);
	  //JFrame frame = new JFrame
	  
	  //Button to calculate monthly payment 
	  /*JButton calculate = new JButton("Calculate");
	  calculate.setSize(100,50);
	  calculate.setLocation(195,360);
	  c.add(calculate);
	  calculate.addActionListener(this);*/
	  int xSpacing=260;
	  int ySpacing=40; 
	  int boxWidth=150;
	  int boxHeight=25;
	  //"Amount Borrowed" label 
	  /*JLabel downPayment = new JLabel("Amount Borrowed");
	  downPayment.setBounds(0,0,200,100);
	  downPayment.setFont(font);
	  c.add(downPayment);*/
	  //Text field box for Amount Borrowed input
	  DPInput = new JTextField();
	  //DPInput.setLocation(200,200);
	  DPInput.setBounds(xSpacing,ySpacing,boxWidth,boxHeight);
	  //c.add(DPInput);
	  add(DPInput);
/*
	  //"Interest Rate" label 
	  JLabel interestRate = new JLabel("Interest Rate");
	  interestRate.setBounds(0,ySpacing*2,200,100);
	  interestRate.setFont(font);
	  c.add(interestRate);
	  //Text field for Interest Rate input
	  IRInput = new JTextField(20);
	  IRInput.setBounds(xSpacing,ySpacing*3,165,25);
	  c.add(IRInput);

	  //"Years" label 
	  JLabel numberOfMonths = new JLabel("Years");
	  numberOfMonths.setBounds(0,ySpacing*4,200,100);
	  numberOfMonths.setFont(font);
	  c.add(numberOfMonths);
	  //Text field for Number of Years input
	  NOMInput = new JTextField(20);
	  NOMInput.setBounds(xSpacing,ySpacing*5,165,25);
	  c.add(NOMInput);
	  
	  //"Payment" label 
	  JLabel payment = new JLabel("Payment:");
	  //payment.setSize(100,100);
	  //payment.setLocation(100,250);
	  payment.setBounds(0,ySpacing*6,200,100);
	  payment.setFont(font);
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
	  //new userInput().setVisible(true);
	  new userInput();
	} 
}
