package ARP;

public class Student extends Person implements ServiceS, Seminar {

	private String studid;
	private double cgpa;

	public Student(String name, String phone, Address address, String studid, double cgpa) {
		super(name, phone, address);
		this.studid = studid;
		this.cgpa = cgpa;
	}

	public void giveAttendance() {
		System.out.println("Giving Attendance...");
	}

	public void giveExam() {
		System.out.println("Giving Exam...");
	}

	public void attendSeminar() {
		System.out.println("Students Attending Seminar.");
	}

	public void display() {
		super.display();
		System.out.println(studid + "," + cgpa);
	}

}

