
public class Teacher extends Person implements ServiceT, Seminar {

	private String designation;

	public Teacher(String name, String phone, Address address, String designation) {
		super(name, phone, address);
		this.designation = designation;
	}

	public void takeAttendance() {
		System.out.println("Taking Attendance");
	}

	public void takeExam() {
		System.out.println("Taking Exam");
	}

	public void attendSeminar() {
		System.out.println("Teachers Attending Seminar.");
	}

	public void display() {
		super.display();
		System.out.println(designation);
	}

}

