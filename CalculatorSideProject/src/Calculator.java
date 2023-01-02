//import java.math;
public class Calculator
{

public static double monthlyMortgagePayment(int downPayment, double interestRate, int timePeriod)
{
	double m= (downPayment * interestRate) / (1 - Math.pow(1 + interestRate, -timePeriod));
	return Math.round(m* 100) / 100;
}

public static void main(String[] args)
{
	//modification of input could be handled by getters
	//int p=userInput.getDownPayment();
	//double r=userInput.getInterestRate();
	//r =(r/100)/12;
	//int t=userInput.getTimePeriod();
	//t=t*12;
	//System.out.println("Monthly Payment: "+monthlyMortgagePayment(p,r,t));	
}
}
