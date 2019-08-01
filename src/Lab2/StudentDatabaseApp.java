package Lab2;

import java.io.PrintStream;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		StudentDatabase stu1 = new StudentDatabase("DarrenWong", "123456789");
		System.out.println("NEW EMAIL: " + stu1.getEmail().toLowerCase() + "@email.com");
		
	}

}
