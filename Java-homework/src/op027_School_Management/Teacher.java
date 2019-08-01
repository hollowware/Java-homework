package op027_School_Management;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Setting up Teacher Object.
	 * @param id
	 * @param name
	 * @param salary
	 */
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	public int getId () {
		return id;
	}
	
	public String getName () {
		return name;
	}
	
	public int getSalary () {
		return salary;
	}
	
	/**
	 * Set the salary
	 * @param salary
	 */
	
	public void setSalary (int salary) {
		this.salary = salary;
	}
	
	/**
	 * Adds to salaryEarned.
	 * Removes from the total money earned by the school.
	 * @param salary
	 */
	public void receiveSalary (int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	
}
