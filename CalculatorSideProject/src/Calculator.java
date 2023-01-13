public class Calculator{
	/*
	 *
	 */
	public static double monthlyMortgagePayment(int downPayment, double interestRate, int timePeriod){
	  interestRate = interestRate/(12*100);
	  timePeriod = timePeriod * 12;
  	  double m= (downPayment * interestRate) / (1 - Math.pow(1 + interestRate, -timePeriod));
          System.out.println(downPayment+"\n"+interestRate+"\n"+timePeriod);
  	  double numerator = downPayment*interestRate;
  	  double denominator = (1-Math.pow(1+interestRate,-timePeriod));
  	  System.out.println(numerator+"\n"+denominator);
	  return m;
  	  //return Math.round(m* 100) / 100;
	}
	public static void main(String[] args){
	  System.out.println(monthlyMortgagePayment(200000,6.5,30)); 
	}
}
