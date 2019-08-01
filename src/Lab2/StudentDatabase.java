package Lab2;

import java.util.Scanner;

public class StudentDatabase {

	// Properties needed for program
	private String name;
	private String sSN;
	private static int iD = 1000;
	private String email;
	private int phone;
	private String city;
	private String state;
	private static String studentID;
	String[] courses = {"Math", "English", "Science", "History"};
	
	
	// Constructor with parameters for user
	public StudentDatabase(String name, String sSN) {
		email = name + "@" + "email.com";
		setEmail(email);
		
		// Static ID + random 4 digit between 1000 and 9000 + last 4 SSN
		int random = ((int) (Math.random() * 1000));
		studentID = iD + "" + random + sSN.substring(5, 9);
		System.out.println(studentID);
		iD++;
		setStudentID(studentID);
				
	}
	
	// Methods
	void enroll() {
		Scanner sc = new Scanner(email);
		
		
	}
	
	void pay() {
	}
	
	void checkBalance() {
	}
	
	public String toString() {
		return toString();
	}
	
	void showCourses() {
	}

	
	// Getters/Setters
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
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
		StudentDatabase.iD = iD;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
