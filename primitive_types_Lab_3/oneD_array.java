package primitive_types;
import java.util.Scanner;
public class oneD_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		sc.close();
		System.out.println("Sum: " + sum);
	}
}