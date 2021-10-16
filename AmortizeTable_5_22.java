package project2;

import java.util.Scanner;

public class AmortizeTable_5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount=input.nextDouble();
		System.out.print("Number of years: ");
		int years=input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate=input.nextDouble() / 100;
		
		double monthRate=annualInterestRate/12;
        double monthlyPayment = amount * monthRate /
                ( 1 - 1 / Math.pow((1 + monthRate), years * 12));
        double totalPayment = monthlyPayment * years * 12;
        System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);
        System.out.printf("Total Payment: %.2f\n",totalPayment);
        
        System.out.println("Payment#     Interest     Principal     Balance");
        double balance=amount,principal,interest;//余额，本金，利率
        for(int i=1;i<=years*12;i++) {
        	interest=monthRate*balance;
        	principal=monthlyPayment-interest;
        	balance=balance-principal;
        	if(i==years*12) {
        		principal=principal+balance;
        	}
        	System.out.printf("%-8d     %-8.2f     %-9.2f     %-7.2f\n",i,interest,principal,balance);
        }
		
	}

}
