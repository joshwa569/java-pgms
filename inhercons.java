package joshwa;

import java.util.Scanner;

class employee{

	String Name,Address;

	int Age;

	long phoneNumber,Salary;

	void printSalary() {

		System.out.println("Salary:"+Salary);

	}
	void printdetails() {
		System.out.println("Name:"+Name+"\nadress:"+Address+"\nAge:"+Age+"\nPhone Num:"+phoneNumber);

	
	}

	

}


class officer extends employee{

	String Specialization;

	officer(String Name,String Address,int Age,long phoneNumber,long Salary,String Specialization){

		this.Name=Name;

		this.Address=Address;

		this.Age=Age;

		this.phoneNumber=phoneNumber;

		this.Salary=Salary;

		this.Specialization=Specialization;

	}

}

class manager extends employee{

	String department;

	manager(String Name,String Address,int Age,long phoneNumber,long Salary,String department){

		this.Name=Name;

		this.Address=Address;

		this.Age=Age;

		this.phoneNumber=phoneNumber;

		this.Salary=Salary;

		this.department=department;

	}

}

public class inhercons {

	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);

		

		System.out.println("DETAILS OF OFFICER:");

		System.out.println("enter the name of officer:");

		String Name=sc.nextLine();

		System.out.println("enter the address of officer:");

		String Address=sc.nextLine();

		System.out.println("enter the age of officer:");

		int Age=sc.nextInt();

		System.out.println("enter the phone Num of officer:");

		long phoneNumber=sc.nextLong();

		System.out.println("enter the salary of officer:");

		long Salary=sc.nextLong();

		System.out.println("enter the specialization of officer");

		String Specialization=sc.next();	

		officer of=new officer(Name,Address,Age,phoneNumber,Salary,Specialization);//constructor of officer

		

		System.out.println("details of manager");

		

		System.out.println("enter the name of Manager");

		Name=sc.next();

		System.out.println("enter the address of Manager");

		Address=sc.next();

		System.out.println("enter the age of Manager");

	    Age=sc.nextInt();

		System.out.println("enter the phone number of Manager");

	    phoneNumber=sc.nextLong();

		System.out.println("enter the salary of Manager");

	    Salary=sc.nextLong();

		System.out.println("enter the department of Manager");

	    String department=sc.next();

	    manager man=new manager(Name,Address,Age,phoneNumber,Salary,department);//constructor of manager

		

		System.out.println("Officer");
		of.printdetails();
		System.out.print("specialistion: "+of.Specialization);


		System.out.println("\nManager");
		man.printdetails();
		System.out.print("department: "+man.department);
		
	}


}