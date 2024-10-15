//Joshwa Thomas
//CSE C 52
//



package joshwa;

import java.lang.Exception;
import java.util.Scanner;
class Age_Exception extends Exception
{
public Age_Exception(String msg)
{
super(msg);
}
}
public class ageex
{
public static void validateAge(int Age)throws Age_Exception
{
if(Age<18)
{
throw new Age_Exception("Not eligible to Vote");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("eligibility Test For Vote");
System.out.println("enter your age: ");
int Age=sc.nextInt();
try
{
validateAge(Age);
System.out.println("You are eligible to vote");
}
catch(Age_Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("Your Response Has been recorded");
sc.close();
}
}}