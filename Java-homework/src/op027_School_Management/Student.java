package op027_School_Management;

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * Constructor is needed to create a new student (object) by initializing.
	 * Fees for every student is 30,000 per year.
	 * Fees paid initially is 0. (When new student created)
	 * @param id - id of the student: unique.
	 * @param name - name of the student.
	 * @param grade - grade of the student.
	 */
	
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	/**
	 * Used to update a students grade.
	 * @param grade new grade of the student.
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * Add the fees to the fees paid.
	 * The school is going to receive the funds.
	 * @param fees - fees that the student pays.
	 */

	public void feesPaid(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}

	
}
