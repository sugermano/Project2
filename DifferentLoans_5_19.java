package project2;

import java.util.Scanner;

public class DifferentLoans_5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double amount=input.nextDouble();
		System.out.print("Number of years: ");
		int years=input.nextInt();
		
		System.out.println("Interest Rate   Monthly Payment   TotalPayment");
		double monthRate=0, monthlyPayment = 0, totalPayment = 0, interestRate = 0;
        for (double i = 5.0; i <= 8.0; i += 1.0 / 8){
            // 月支付额度计算
            interestRate = i / 100;
            monthRate=interestRate / 12;
            monthlyPayment = amount * monthRate /
                    ( 1 - 1 / Math.pow((1 + monthRate), years * 12));
            totalPayment = monthlyPayment * years * 12;

            System.out.printf("%4.3f", i);
            System.out.print("%");
            System.out.printf("          %6.2f             %8.2f\n", monthlyPayment, totalPayment);
        }
	}

}
