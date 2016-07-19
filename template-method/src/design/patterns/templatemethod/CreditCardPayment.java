package design.patterns.templatemethod;

public class CreditCardPayment extends PaymentMethod {

	@Override
	protected void getCredentials() {
		System.out.println("[*] Retrieving Credit Card No. and CCV");
	}

	@Override
	protected boolean checkTransactionResult() {
		System.out.println("[*] Checking transaction result");
		return false;
	}

}
