package in.spring.demo;

//service class/BC
public class StudentProgressReportService {
 
	public String generateResult1(int sno ,String sname, String addrs , int math , int science,int history) {
		int marks = math+science+history;
		System.out.println("Total student mark is :: " +marks);
		float per = marks/500*100;
		System.out.println("Student Percentage is :: " +per);
		return "Total percentage " +per;
	}
	
	public String generateResult(Student st) {
      st.getSname();
      
		System.out.println("Total student mark is :: " +st.getSno());
		System.out.println("Total student mark is :: " +st.getSname());
		System.out.println("Student Percentage is :: " +st.getAddrs());
		return "pass" ;
	}
}
