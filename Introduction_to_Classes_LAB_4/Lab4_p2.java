package LAB;

import java.util.Scanner;

class Circle {
	double radius;

	double setRadius(double r) {
		this.radius = r;
		return 0;
	}

	double area() {
		return 3.14159265 * radius * radius;
	}
}

public class Lab4_p2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		System.out.println("Enter radius: ");
		double r = sc.nextDouble();
		double res;

		res = circle.setRadius(r);
		System.out.println("Area of Circle: " + circle.area());
	}
}
