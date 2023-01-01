package in.spring.demo;

public class ClientApp {

	public static void main(String[] args) {
		 StudentProgressReportService pr =  new StudentProgressReportService();
		// pr.generateResult(11, "Rani","Delhi" ,  50,70, 90);
		 Student st = new Student();
		 st.setSno(101);
		 st.setSname("Radha");
		 
		 String result = pr.generateResult(st);
		 System.out.println(result);
	}

}
