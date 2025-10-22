package LAB;

class Box {
	double width;
	double height;
	double depth;
}

public class Lab4_p3 {
	public static void main(String args[]) {
		Box b1 = new Box();
		Box b2 = b1;

		b1.depth = 5;
		b1.height = 10;
		b1.width = 7;

		System.out.println("Heigth Via b1: " + b2.height);
	}
}
