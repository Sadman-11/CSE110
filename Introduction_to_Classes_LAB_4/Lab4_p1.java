package LAB;

class Rectangle {
	double length;
	double width;

	double area() {
		return width * length;
	}
}

public class Lab4_p1 {
	public static void main(String args[]) {
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		
		rectangle1.length = 10;
		rectangle1.width = 5;
		
		rectangle2.length = 15;
		rectangle2.width = 15;

		System.out.println("Area of Rectangle 1: " + rectangle1.area());
		System.out.println("Area of Rectangle 1: " + rectangle2.area());
	}
}
