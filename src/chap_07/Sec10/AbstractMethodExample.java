package chap_07.Sec10;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        System.out.println();

        animalSound(dog);
        animalSound(cat);
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
