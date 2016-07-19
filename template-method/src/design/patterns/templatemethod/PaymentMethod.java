package design.patterns.templatemethod;

public abstract class PaymentMethod {
	/**
	 * Template method. Defines the steps of an algorithm and lets subclasses
	 * define some or all of those steps without changing the algorithm's
	 * structure.
	 */
	public void pay() {
		getCredentials(); // Step 1
		if (checkTransactionResult()) { // Step 2
			notifySuccess(); // Step 3a
		} else {
			notifyFailure(); // Step 3b
		}
	}

	/**
	 * Because different payment methods use different credentials, subclasses
	 * have to override this method and define their own way to retrieve them.
	 */
	protected abstract void getCredentials();

	/**
	 * Different payment methods have different ways to check the result of a
	 * transaction.
	 */
	protected abstract boolean checkTransactionResult();

	/**
	 * Template methods can include steps that have to be common in every
	 * implementation of the process.
	 */
	private void notifySuccess() {
		System.out.println("[*] The transaction succeeded");
	}

	private void notifyFailure() {
		System.out.println("[*] The transaction failed!");
	}

}
