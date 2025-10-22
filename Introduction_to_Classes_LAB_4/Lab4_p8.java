package LAB;

class Temp {
	
	int id;
	
	Temp(int id){
		this.id = id;
		System.out.println("Object 1 created");
	}
	
	protected void finalize() {
		System.out.println("Object 1 created");
	}
}

public class Lab4_p8 {
	public static void main(String args[]) {
		Temp cube = new Temp(5);
		System.out.println("End of main()");
		System.gc();
	}
}
