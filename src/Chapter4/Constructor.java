package Chapter4;

public class Constructor {
	String carname;
	int speed;
	public Constructor (){	//������
		this.carname = "Car";
		this.speed = 0;		
	}
	public Constructor (String name, int speed){	//������
		this.carname = name;
		this.speed = speed;		
	}
	public void print () {	//�޼ҵ�
		System.out.println("name : "+carname);
		System.out.println("speed : "+speed);
	}
	
}
