package primitive_types;

public class type_casting {
	public static void main(String[] args) {
		int a = 100;
		double b = a;
	
		double pi = 3.14159;
		int explicit = (int) pi;
		System.out.println("Implicit: " + b);
		System.out.println("Explicit: " + explicit);
	}
}
