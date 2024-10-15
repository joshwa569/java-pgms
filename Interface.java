package joshwa;

abstract class Animal{

	protected int legs;

	protected Animal(int legs){

		this.legs = legs;

	}

	abstract void Eat();

	public void walk(){

		System.out.println("Walk");

	}

}

interface Pet{

	public String getName();

	public void SetName(String name);

	public void play();

}

class Spider extends Animal{

	Spider (){

		super(8);

	}

	void Eat (){

		System.out.println("Spider Eats Insects");

	}

	void Walk() {

		System.out.println("Spider walk thorough its"+" " +legs +" "+"legs");

	}

}

class Cat extends Animal implements Pet{

	private String name;

	Cat(String name){

		super(4);
		this.name = name;
		System.out.println("The name of the cat is "+name);

	}

	public void Eat() {

		System.out.println("Cats eats Fish.");

	}

	public void walk() {

		System.out.println("Cat walk thorough its" +" "+legs+" " +"legs");

	}

	public String getName() {

		return name;

	}

	public void play() {

		System.out.println("Cat is Playing:");

	}

	public void SetName(String name) {

		this.name =name;

	}

}

class Fish extends Animal implements Pet{

	private String name;

	Fish(String name){

		super(0);
		this.name = name;
		System.out.println("The name of the fish is "+name);

	}

	public void Eat() {

		System.out.println("Fish eats plant");

	}

	public void Walk() {

		System.out.println("Fish does not walk it swims");

	}

	public String getName() {

		return name;

	}

	public void play() {

		System.out.println("Fish is playing:");

	}

	public void SetName(String name) {

		this.name =name;

		

	}

}

public class Interface {

public static void main (String[] args) {

		Spider sp = new Spider();

		

		

		System.out.println("SPIDER");

		sp.Eat();

		sp.Walk();

		System.out.println("CAT");
		Cat    ct = new Cat ("pussy");

		ct.SetName("mittu");

		System.out.println("Name of the CAT is :"+ct.getName());

		ct.Eat();

		ct.walk();

		ct.play();

		System.out.println("FISH");
		Fish   fh = new Fish("nemo");

		fh.SetName("Dorry");

		System.out.println("Name of the Fish is :"+fh.getName());

		fh.Eat();

		fh.Walk();

		fh.play();

	}

}
	
