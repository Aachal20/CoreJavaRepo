package in.interf.mobileApp;

public interface SIM {
   void call();
   void sms();
   default void videoCall() {
	   
   }
}
