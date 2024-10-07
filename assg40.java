

    class Animal {
        void sound() {
            System.out.println("This animal makes a sound");
        }
    }


    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("The dog barks");
        }
    }
    
    public class assg40 {
        public static void main(String[] args) {
            Animal myAnimal = new Animal(); // Animal object
            Animal myDog = new Dog(); // Dog object as an Animal
    
            myAnimal.sound(); // Calls the method in Animal
            myDog.sound(); // Calls the overridden method in Dog
        }
    }
    
    

