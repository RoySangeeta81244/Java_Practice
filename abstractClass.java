
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
interface frontLight{
    void frontlight();
}

// Subclass (inherit from Animal)
class Pig extends Animal implements frontLight {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
   public void frontlight(){
        System.out.println("I am frontlight");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        myPig.frontlight();
    }
}



