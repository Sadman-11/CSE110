package LAB;

class Student {
	int id;
	String name;
	double cgpa;
	
	Student(){
		id = 0;
		name = "Unknown";
		cgpa = 0.0;
	}
}

public class Lab4_p4 {
	public static void main(String args[]) {
		Student student = new Student();
		
		System.out.println(student.id + " - " + student.name + " - " + student.cgpa);
	}
}
