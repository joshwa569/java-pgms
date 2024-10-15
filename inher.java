package joshwa;

import java.util.Scanner;

class Employee {
    String Name, Address;
    int Age;
    long phoneNumber, Salary;

    void printSalary() {
        System.out.println("Salary: " + Salary);
    }
}

class Officer extends Employee {
    String Specialization;
}

class Manager extends Employee {
    String department;
}

public class inher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer of = new Officer();
        System.out.println("Details of officer:");
        System.out.print("Enter the name of officer: ");
        of.Name = sc.nextLine();
        System.out.print("Enter the address of officer: ");
        of.Address = sc.nextLine();
        System.out.print("Enter the age of officer: ");
        of.Age = sc.nextInt();
        System.out.print("Enter the phone number of officer: ");
        of.phoneNumber = sc.nextLong();
        System.out.print("Enter the salary of officer: ");
        of.Salary = sc.nextLong();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the specialization of officer: ");
        of.Specialization = sc.nextLine();

        Manager man = new Manager();
        System.out.println("Details of manager:");
        System.out.print("Enter the name of manager: ");
        man.Name = sc.nextLine();
        System.out.print("Enter the address of manager: ");
        man.Address = sc.nextLine();
        System.out.print("Enter the age of manager: ");
        man.Age = sc.nextInt();
        System.out.print("Enter the phone number of manager: ");
        man.phoneNumber = sc.nextLong();
        System.out.print("Enter the salary of manager: ");
        man.Salary = sc.nextLong();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the department of manager: ");
        man.department = sc.nextLine();

        System.out.println("\nOfficer:");
        System.out.println("Name: " + of.Name);
        System.out.println("Address: " + of.Address);
        System.out.println("Age: " + of.Age);
        System.out.println("Phone Number: " + of.phoneNumber);
        System.out.println("Specialization: " + of.Specialization);
        of.printSalary();

        System.out.println("\nManager:");
        System.out.println("Name: " + man.Name);
        System.out.println("Address: " + man.Address);
        System.out.println("Age: " + man.Age);
        System.out.println("Phone Number: " + man.phoneNumber);
        System.out.println("Department: " + man.department);
        man.printSalary();

        
    }
}

