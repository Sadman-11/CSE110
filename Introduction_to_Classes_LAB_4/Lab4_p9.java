package LAB;

class Box1 {
	double width;
	double length;
	double height;
	
	Box1(double height, double length, double width){
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	
	double volume() {
		return width * length * height;
	}
}

public class Lab4_p9 {
	public static void main(String args[]) {
		Box1 box1 = new Box1(5, 3, 2);
		Box1 box2 = new Box1(51, 32, 21);
		Box1 box3 = new Box1(2, 3, 4);
		System.out.println("Volume of 1: " + box1.volume());
		System.out.println("Volume of 2: " + box2.volume());
		System.out.println("Volume of 3: " + box3.volume());
	}
}
