public class Calculator{
	/*
	 *Calculates payment per month using the principle, yearly interest rate, and years as inputs
	 */
	public static double monthlyMortgagePayment(int downPayment, double interestRate, int timePeriod){
	  interestRate = interestRate/(12*100);
	  timePeriod = timePeriod * 12;
  	  double m= (downPayment * interestRate) / (1 - Math.pow(1 + interestRate, -timePeriod));
          System.out.println(downPayment+"\n"+interestRate+"\n"+timePeriod);
  	  return Math.round(m* 100) / 100.0;
	}
	public static void main(String[] args){
	  System.out.println(monthlyMortgagePayment(200000,6.5,30)); 
	}
}
