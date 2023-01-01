package in.demo.inheritance.HAS_A;

public class Bike {
	 
    private String color;  
    private int maxSpeed;  
    
    public void bikeInfo()  
    {  
        System.out.println("Bike Color= "+color + " Max Speed= " + maxSpeed);  
    }  
    
    public void setColor(String color)  //red
    {  
        this.color = color;  //null  red
    }  
    
    public void setMaxSpeed(int maxSpeed)  
    {  
        this.maxSpeed = maxSpeed;  // 50kmph
    }  
}  