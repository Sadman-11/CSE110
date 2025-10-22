package LAB;

class Cube {
	double side;
	
	Cube(double side){
		this.side = side;
	}
	
	double volume() {
		return side*side*side;
	}
}

public class Lab4_p7 {
	public static void main(String args[]) {
		Cube cube = new Cube(5);
		
		System.out.println("Volume of Cube: " + cube.volume());
	}
}
