package LAB;

class Rectangle1 {
	double length;
	double width;
	
	Rectangle1(double length, double width){
		this.length = length;
		this.width = width;
	}
	double area() {
		return width * length;
	}
}

public class Lab4_p6 {
	public static void main(String args[]) {
		Rectangle1 r = new Rectangle1(5, 10.2);
		System.out.println("Area: " + r.area());
	}
}
