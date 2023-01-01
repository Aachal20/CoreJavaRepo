package in.demo.encapsulation;

public class Examplee {
	
	  private int x = 10;
	   private int y = 20;
	   
	   public Examplee() {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Examplee [x=" + x + ", y=" + y + "]";
	}
	   
	   
	   
}
