package joshwa;
import java.util.Scanner;

class Employeee{

	float gross_Salary,salary,da,hra;

	void Display(){

		System.out.println("...Empolyee...");

	}

	void calcSalary() {

		gross_Salary=(salary+(da/100)*salary+(hra/100)*salary);

		System.out.println("Salary of the Employee is:"+gross_Salary);

	}

}

class Engineer extends Employeee{

	Engineer(float salary,float da,float hra){

		this.salary=salary;

		this.da=da;

		this.hra=hra;

	}

	void Display(){

		super.Display();

		super.calcSalary();

		System.out.println("...Engineer...");

	}

	void calcSalary(){

		System.out.println("Salary of the Engineer is:"+(gross_Salary*2));

	}

}

public class supe {

	public static void main(String []args) {

		float salary,da,hra;

		Scanner in  =  new Scanner (System.in);

		System.out.println("Enter the salary");

	    salary =in.nextFloat();

		System.out.println("Enter the DA");

		da=in.nextFloat();

		System.out.println("Enter the HRA");

		hra=in.nextFloat();

		Engineer eng = new Engineer(salary,da,hra);

		eng.Display();

		eng.calcSalary();

	}

}