package design.patterns.templatemethod;

public class EbankingPayment extends PaymentMethod {

	@Override
	protected void getCredentials() {
		System.out.println("[*] Retrieving username and password");
	}

	@Override
	protected boolean checkTransactionResult() {
		System.out.println("[*] Checking transaction result");
		return true;
	}

}
