package in.interf.mobileApp;

public class Jio implements SIM {

	@Override
	public void call() {
	System.out.println("Calling Using Jio");

	}

	@Override
	public void sms() {
	System.out.println("Sending SMS Using jio");
	}

	@Override
	public void videoCall() {
		// TODO Auto-generated method stub
		//SIM.super.videoCall();
		System.out.println("Video calling using Jio");
	}
}
