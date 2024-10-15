package joshwa;


abstract class Shape{
	abstract void numberofsides();
	
	abstract void sumofangles();
}


class rectangle extends Shape{
	int side;
	rectangle(int side){
		this.side=side;
	}

	@Override
	void numberofsides() {
		System.out.println("no of sides:"+side);
	}
	@Override
	void sumofangles() {
		int sum=(side-2)*180;
		System.out.println("sum of angles"+sum);
		
	}
}
	
class triangle extends Shape{
	int side;
	triangle(int side){
		this.side=side;
	}

	@Override
	void numberofsides() {
		System.out.println("no of sides:"+side);
	}
	@Override
	void sumofangles() {
		int sum=(side-2)*180;
		System.out.println("sum of angles"+sum);
		
	}
}
	
class hexagon extends Shape{
	int side;
	hexagon(int side){
		this.side=side;
	}

	@Override
	void numberofsides() {
		System.out.println("no of sides:"+side);
	}
	@Override
	void sumofangles() {
		int sum=(side-2)*180;
		System.out.println("sum of angles"+sum);
		
	}
}

public class abst {
	 public static void main(String []args) {
		 
		 rectangle re= new rectangle(4);
		 re.numberofsides();
		 re.sumofangles();
		 triangle tr=new triangle(3);
		 tr.numberofsides();
		 tr.sumofangles();
		 hexagon hx=new hexagon(6);
		 hx.numberofsides();
		 hx.sumofangles();
		 
	 }

}
