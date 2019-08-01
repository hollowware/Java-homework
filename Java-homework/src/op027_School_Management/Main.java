package op027_School_Management;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher melissa = new Teacher(2, "Melissa", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(melissa);
		teacherList.add(vanderhorn);
		
		Student tamasha = new Student(1, "Tamasha", 4);
		Student rashith = new Student(2, "Rakshith", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rashith);
		studentList.add(rabbi);
		
		School ghs = new School(teacherList, studentList);
		
		tamasha.feesPaid(5000);
		rashith.feesPaid(6000);
		rabbi.feesPaid(4000);
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned());
		System.out.println();
		System.out.println("--GHS pay salary--");
		lizzy.receiveSalary(lizzy.getSalary());
		melissa.receiveSalary(melissa.getSalary());
		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println("GHS has spent for salary to " + lizzy.getName() 
		+ " and now has " + ghs.getTotalMoneyEarned() + " left.");
	}
}
