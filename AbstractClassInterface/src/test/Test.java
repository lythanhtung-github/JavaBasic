package test;

public class Test {


    public static void main(String[] args) {

        Animal animal = new Chicken();

        eat(animal);

        animal = new Duck();

        System.out.println();

    }

    public static void eat(Animal animal) {

        animal.howToEat();

    }
}
