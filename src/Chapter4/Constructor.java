package Chapter4;

public class Constructor {
	String carname;
	int speed;
	public Constructor (){	//持失切
		this.carname = "Car";
		this.speed = 0;		
	}
	public Constructor (String name, int speed){	//持失切
		this.carname = name;
		this.speed = speed;		
	}
	public void print () {	//五社球
		System.out.println("name : "+carname);
		System.out.println("speed : "+speed);
	}
	
}
