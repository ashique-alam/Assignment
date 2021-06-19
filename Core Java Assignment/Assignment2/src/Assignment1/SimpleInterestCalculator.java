package Assignment1;

public class SimpleInterestCalculator {
	
	double principal;
	//double amount;
	int numberOfYears;
	double simpleInterest;
	
	SimpleInterestCalculator(double principal,/*double amount,*/int numberOfYears){
		this.principal=principal;
		//this.amount=amount;
		this.numberOfYears=numberOfYears;
	}
	
	public void calculateSimpleInterest() {
		if(principal>100000) {
			if(numberOfYears>10) {
				simpleInterest=(principal*numberOfYears*10)/100;
			}
			else {
				simpleInterest=(principal*numberOfYears*9.5)/100;
			}
		}
		else {
			if(numberOfYears>10) {
				simpleInterest=(principal*numberOfYears*5)/100;
			}
			else {
				simpleInterest=(principal*numberOfYears*4.5)/100;
			}
		}
		
		System.out.println("“The interest amount for a principal of "+(int)principal+" and years "+numberOfYears+" is "+(int)simpleInterest);
	}
	
	public static void main(String []args) {
		SimpleInterestCalculator si=new SimpleInterestCalculator(200000,12);
		si.calculateSimpleInterest();
		
		SimpleInterestCalculator si1=new SimpleInterestCalculator(50000,12);
		si1.calculateSimpleInterest();
		
		SimpleInterestCalculator si2=new SimpleInterestCalculator(50000,5);
		si2.calculateSimpleInterest();
	}
	
	

}
