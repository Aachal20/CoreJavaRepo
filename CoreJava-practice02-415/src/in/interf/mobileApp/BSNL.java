package in.interf.mobileApp;

public  class BSNL implements SIM {

	@Override
	public void call() {
	System.out.println("Calling Using BSNL");
	}

	@Override
	public void sms() {
		System.out.println("Sending sms using BSNL");
		
	}

	

}
