package ARP;

public class University {

	Teacher teacher;
	Student student;

	public University(Teacher teacher, Student student) {
		this.teacher = teacher;
		this.student = student;
	}

	public static void main(String[] args) {
		Address a2 = new Address("Noakhali", "United States of Noakhali");
		Teacher t = new Teacher("Ananta Jalil", "015555555", a2, "Professor");
		/*
		 * t.display(); t.takeAttendance(); t.takeExam(); t.attendSeminar();
		 */

		Address a1 = new Address("Dhaka", "Bangladesh");
		Student s = new Student("Shakib Khan", "0171500000", a1, "181-15-0000", 3.90);
		/*
		 * s.display(); s.giveAttendance(); s.giveExam(); s.attendSeminar();
		 */

		University u = new University(t, s);

		u.teacher.display();
		u.teacher.takeAttendance();
		u.teacher.takeExam();
		u.teacher.attendSeminar();

		u.student.display();
		u.student.giveAttendance();
		u.student.giveExam();
		u.student.attendSeminar();

	}

}
