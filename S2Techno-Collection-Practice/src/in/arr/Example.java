package in.arr;

public class Example {
   int sno;
   String sname;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Example(int sno, String sname) {
	super();
	this.sno = sno;
	this.sname = sname;
}
@Override
public String toString() {
	return "Example [sno=" + sno + ", sname=" + sname + "]";
}


}
