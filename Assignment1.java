package p1;

public class Assignment1 {
	public static void main(String []args) {
		
		
	    double monthlySalary = 25000;
	    double annualBasicSalary = monthlySalary*12;
	
	    double hra = annualBasicSalary *0.20;
	    double da = (annualBasicSalary *0.40) +hra ;
	    double ta=0;
	    if(annualBasicSalary > 500000) {
	          ta = annualBasicSalary*0.10;
	    }
	
	    double annualSalary= annualBasicSalary+hra+da+ta;
	    
	    if(annualSalary < 500000)
	    {
	    	System.out.println("NO TAX");
	    }
	    else if (annualSalary >= 500000 && annualSalary <= 1000000)
	    {
	    	double tax = annualSalary*0.10;
	    	System.out.println("It is taxable salary");
	    	System.out.println("Your tax amount is"+tax);
	    }
	    else if (annualSalary > 1000000 && annualSalary <= 2000000) {
	    	double tax = annualSalary*0.20;
	    	System.out.println("It is taxable salary");
	    	System.out.println("Your tax amount is"+tax);
	    }
	    else 
	    {
	    	double tax = annualSalary*0.30;
	    	System.out.println("It is taxable salary");
	    	System.out.println("Your tax amount is"+tax);
	    }
	    
	}	   		

}
