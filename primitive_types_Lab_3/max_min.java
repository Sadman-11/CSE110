package primitive_types;
import java.util.Scanner;
public class max_min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		int max = 0, min = 999999999;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			array[i] = sc.nextInt();
			
			if(max < array[i]) {
				max = array[i];
			} 
			if(min > array[i])  {
				min = array[i];
			}
		}
		sc.close();
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}