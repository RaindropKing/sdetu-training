package Lab2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("Darren", "123456789");
		Student stu2 = new Student("Gia", "746354582");
		Student stu3 = new Student("Arsie", "524364588");

		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}
	
	private String name;
	private String sSN;
	private static int iD = 0;
	private String email;
	private String phone;
	private String city;
	private String state;
	private static String studentID;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	
	// Constructor with parameters for user
	public Student(String name, String sSN) {
		iD++;
		this.name = name;
		this.sSN = sSN;
		setStudentID();
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@" + "sdetuniversity.com";
		System.out.println("Your Email: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setStudentID() {
		// Static ID + random 4 digit between 1000 and 9000 + last 4 SSN
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * ((max - min)));
		random = random + min;
		studentID = iD + "" + random + sSN.substring(5);
		System.out.println("\nYour Student ID: " + studentID);	
	}

	// Methods
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		System.out.println(courses);
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: " + amount);
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public String toString() {
		return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\nBALANCE: " + balance + " ]";
	}
	
	void showCourses() {
		System.out.println(courses);
	}

	
	// Getters/Setters
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static int getiD() {
		return iD;
	}

	public static void setiD(int iD) {
		Student.iD = iD;
	}
	




	public void setEmail(String email) {
		this.email = email;
	}
}
