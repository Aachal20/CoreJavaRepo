package in.interf.mobileApp;

public class Airtel implements SIM {

	@Override
	public void call() {
		System.out.println("Calling Using Airtel");

	}

	@Override
	public void sms() {
		System.out.println("Sending SMS Using Airtel");

	}
	
	@Override
	public void videoCall() {
		// TODO Auto-generated method stub
		SIM.super.videoCall();
		System.out.println("Video calling usig AIrtel");
	}

}
