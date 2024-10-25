package joshwa;


import java.util.*;

public class strtok {

public static void main(String[] args) {

int sum=0,n=0;

Scanner sc = new Scanner (System.in);

System.out.println("enter the Number");

String num = sc.nextLine();

StringTokenizer st = new StringTokenizer(num," ");

while(st.hasMoreTokens ()){

	String temp=st.nextToken();
	n=Integer.parseInt(temp);
	sum=sum+n;
}

System.out.println("sum: " +sum);

}
}
