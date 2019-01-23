import java.util.Scanner;
import java.util.LinkedList;

/**
 * Given an animal shelter object, provide methods
 * to dequeue animals from queue of cats and dogs.
 *
 */
public class AnimalShelter
{
    public static void main(String args[]) {

        AnimalQueue queue = new AnimalQueue();
        queue.enqueue(new Dog("Charlie"));
        queue.enqueue(new Dog("Cooper"));
        queue.enqueue(new Dog("Rocky"));
        queue.enqueue(new Cat("Buddy"));
        queue.enqueue(new Cat("Rocky"));
        queue.enqueue(new Cat("Simba"));
        queue.enqueue(new Cat("Luna"));

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Which pet do you want to adopt?");
        System.out.print("Enter 1 for dog, 2 for cat or 3 for any animal: ");

        int selection = keyboard.nextInt();
        // Validate users input
        while (selection < 1 || selection > 3) {
            // Get a number from the user.
            System.out.print("Invalid number! Enter 1 for dog, 2 for cat or 3 for any animal: ");
            selection = keyboard.nextInt();
        }
        if (selection == 1) {
            // Dequeue dog from the queue of dogs
            Dog dogSelect = queue.dequeueDog();

            System.out.println(dogSelect.name);
        }
        else if (selection == 2) {
            // Dequeue cat from the queue of cats
            Cat catSelect = queue.dequeueCat();

            System.out.println(catSelect.name);
        }
        else {
            // Dequeue any animal from the queue of dogs and cats
            Animal animal = queue.dequeueAny();

            System.out.println(animal.name);
        }
    }
}


abstract class Animal
{
    private int order;
    public String name;
    public Animal(String n) {
        name = n;
    }
    public void setOrder(int ord) {
        order = ord;
    }
    public int getOrder() {
        return order;
    }
    public boolean isOlderThan(Animal a) {
        return this.order < a.getOrder();
    }
}

class Dog extends Animal
{
    public Dog(String n) {
        super(n);
    }
}

class Cat extends Animal
{
    public Cat(String n) {
        super(n);
    }
}

class AnimalQueue
{
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();
    private int order = 0; // Counter acts as timestamp

    public AnimalQueue() {
    }

    public void enqueue(Animal a) {
        a.setOrder(order);
        order++;
        if (a instanceof Dog) dogs.addLast((Dog) a);
        if (a instanceof Cat) cats.addLast((Cat) a);
    }

    public Animal dequeueAny() {
        Dog d = dogs.peek();
        Cat c = cats.peek();
        if (d.isOlderThan(c)) return dequeueDog(); else return dequeueCat();
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }
}


