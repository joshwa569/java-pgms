package joshwa;
import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator extends Thread {
private final Random random;
private final EvenNumberProcessor evenProcessor;
private final OddNumberProcessor oddProcessor;

public RandomNumberGenerator(EvenNumberProcessor evenProcessor, OddNumberProcessor oddProcessor) {
this.random = new Random();
this.evenProcessor = evenProcessor;
this.oddProcessor = oddProcessor;
}

@Override
public void run() {
while (true) {
int number = random.nextInt(100);
System.out.println("Generated: " + number);
if (number % 2 == 0) {
evenProcessor.process(number); 
} else {
oddProcessor.process(number);
}
try {
Thread.sleep(1000); 
} catch (InterruptedException e) {
Thread.currentThread().interrupt();
break;
}
}
}
}

class EvenNumberProcessor extends Thread {
public void process(int number) {
int square = number * number;
System.out.println("Even Square: " + square);
}
}

class OddNumberProcessor extends Thread {
public void process(int number) {
int cube = number * number * number;
System.out.println("Odd Cube: " + cube);
}
}

public class multi {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


EvenNumberProcessor evenProcessor = new EvenNumberProcessor();
OddNumberProcessor oddProcessor = new OddNumberProcessor();


RandomNumberGenerator generator = new RandomNumberGenerator(evenProcessor, oddProcessor);
generator.start();

System.out.println("Press Enter to stop the program...");
scanner.nextLine(); 

generator.interrupt(); 
scanner.close();
}
}
