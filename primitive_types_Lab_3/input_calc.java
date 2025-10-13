package primitive_types;
import java.util.Scanner;

public class input_calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double x = sc.nextDouble();
		System.out.print("Enter second number: ");
		double y = sc.nextDouble();

		System.out.println("Sum = " + (x + y));
		System.out.println("Difference = " + (x - y));
		System.out.println("Quotient = " + (x / y));
		sc.close();
	}
}