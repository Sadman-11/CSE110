package LAB;

class Student1 {
	int id;
	String name;
	double cgpa;
	
	Student1(int id, String name, double cgpa){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
}

public class Lab4_p5 {
	public static void main(String args[]) {
		Student1 student = new Student1(101, "Rahim", 3.75);
		Student1 student2 = new Student1(102, "Karim", 3.6);
		
		System.out.println(student.id + " - " + student.name + " - " + student.cgpa);
		System.out.println(student2.id + " - " + student2.name + " - " + student2.cgpa);
	}
}
