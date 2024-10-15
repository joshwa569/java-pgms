package joshwa;
import java.util.Scanner;

public class matrix {
	public static void main(String args[])
	{
		int r1,r2,c1,c2,i,j;
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter the number rows in the first matrix:");
		r1=s.nextInt();
		System.out.print("enter the number columns in the first matrix:");
		c1=s.nextInt();
		System.out.print("enter the number rows in the second matrix:");
		r2=s.nextInt();
		System.out.print("enter the number columns  in the second matrix:");
		c2=s.nextInt();
		
		if(c1!=r2) {
			System.out.println("multiplication not possible");
			return;
		}
		
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c2];
		
		System.out.println("enter the first matrix");
		for(i=0;i<r1;i++)
			for(j=0;j<c1;j++)
				a[i][j]=s.nextInt();
		
		System.out.println("enter the second matrix");
		for(i=0;i<r2;i++)
			for(j=0;j<c2;j++)
				b[i][j]=s.nextInt();
		
		System.out.println("the product matrix is:");
		for(i=0;i<r1;i++) {
			for(j=0;j<c2;j++) {
				c[i][j]=0;
				
				for(int k=0;k<c1;k++) {
					c[i][j]+=a[i][j]*b[i][j];
				}
			
		
		
				System.out.print(c[i][j]+" ");
			}
				System.out.println();
			}
		
		
		
	}

}
