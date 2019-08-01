package op027_School_Management;

import java.util.List;

public class School {
	
	/**
	 * School contains many Teachers and man Students.
	 * Implements Teachers and Students an Array List.
	 */
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	/**
	 * New school object is created
	 * @param teachers - list of teachers in the school
	 * @param students - list of students in the school
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	/**
	 * Returns the list of teachers.
	 * @return
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * 
	 * @return the list of students in the school.
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * 
	 * @return total money earned by the school.
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	

	/**
	 * Add a teacher to the school.
	 * @param teachers the teacher to be added.
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}


	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * Adds the total money by the school
	 * @param MoneyEarned money that supposed to be added.
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	/**
	 * update money that is spent by the school. (only teachers salary)
	 * @param MoneySpent
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
		
	
}
