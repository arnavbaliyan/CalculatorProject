public class Calculator{
	/*
	 *Calculates payment per month using the principle, yearly interest rate, and years as inputs
	 *Unit conversions are done for interestRate(yearly percent to monthly decimal) and the timePeriod(years to months)
	 */
	public static double monthlyMortgagePayment(int principle, double interestRate, int timePeriod){
	  interestRate = interestRate/(12*100);
	  timePeriod = timePeriod * 12;
  	  double m= (principle * interestRate) / (1 - Math.pow(1 + interestRate, -timePeriod));
  	  return Math.round(m* 100) / 100.0;
	}
}
