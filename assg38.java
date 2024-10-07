

    // Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("This dog barks");
    }
}
public class assg38 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // inherited method
        myDog.bark(); // subclass method
    }
}

    

