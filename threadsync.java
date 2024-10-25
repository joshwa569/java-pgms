package joshwa;

import java.util.*;
import java.lang.Exception;
class Table{
 synchronized void print(int n){
for(int i=1;i<=5;i++){
  System.out.println(i+ "+" +n+ "=" +(i+n));
 }
 System.out.println("");
try{
     Thread.sleep(1000);
}
catch(Exception e){
System.out.println(e);
   }
}
}
class No1 extends Thread {
Table t;
int n;
No1(Table t){
    this.t=t;
}
public void run(){
t.print(n);
}
}
class No2 extends Thread{
Table t;
int n;
No2(Table t){
this.t=t;
 }
public void run(){
t.print(n);
}
}
class No3 extends Thread{
Table t;
int n;
No3(Table t){
   this.t=t;
}
public void run(){
t.print(n);
}
}
public class threadsync{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
Table t=new Table();
No1 no1=new No1(t);
No2 no2=new No2(t);
No3 no3=new No3(t);
 System.out.println("Enter first number: ");
 no1.n=sc.nextInt();
System.out.println("Enter second number: ");
 no2.n=sc.nextInt();
System.out.println("Enter third number: ");
 no3.n=sc.nextInt();
System.out.println(" ");
 no1.start();
 no2.start();
 no3.start();
   }
 }
