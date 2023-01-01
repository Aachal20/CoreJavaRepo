package in.interf.mobileApp;

public class Customer {

	public static void main(String[] args) {
		//	Airtel airtel = new Airtel();
			//airtel.call();
		//	airtel.sms();
			
		/*	SIM sim;
			 sim = new Airtel();
		sim.call();
		sim=new Jio();
		sim.call();
		   // sim = new BSNL();
		//sim.call();
		*/
		
		Mobile mobile = new Mobile();
		//mobile.insertSim(new BSNL());
		mobile.insertSim(new Jio());
	}

}
