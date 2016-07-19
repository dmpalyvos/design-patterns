package design.patterns.templatemethod.test;

import design.patterns.templatemethod.*;

public class Run {

	public static void main(String[] args) {
		System.out.println("[-] Starting credit card transaction");
		PaymentMethod creditCard = new CreditCardPayment();
		// Call the template method
		creditCard.pay();
		System.out.println("[-] Starting e-banking transaction");
		PaymentMethod ebanking = new EbankingPayment();
		// Call the template method
		ebanking.pay();
	}

}
