package joshwa;


abstract class Anima {
     String name;
     String sound;

    
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    
    public abstract void makeSound();
}


class Dog extends Animal {
    
    public Dog(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes the sound  " +sound);
    }
}

class Ca extends Animal {
    
    public Cat(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes the sound  " +sound);
    }
}

public class animal{
    public static void main(String[] args) {
        
        Dog dog = new Dog("dog", "Woof");

        
        Cat cat = new Cat("cat", "Meow");

        
        dog.makeSound();
        cat.makeSound();
    }
}



        
