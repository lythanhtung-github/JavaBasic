package test_animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog", 10, true));
        animals.add(new Animal("Cat", 5, true));
        animals.add(new Animal("Lộc", 1, true));
        animals.add(new Animal("Khanh", 2, true));
        animals.add(new Animal("Lộc", 1, true));
        animals.add(new Animal("Lộc", 1, true));
        animals.add(new Animal("Khanh", 2, true));

        for (Animal animal : animals){
            System.out.println(animal);
        }

        attack(animals.get(2), animals.get(3));

        for (Animal animal : animals){
            System.out.println(animal);
        }
    }

    public static void attack(Animal a1, Animal a2){
        if (a1.getPower() >a2.getPower()){
            System.out.printf("%s đấm vỡ mồm %s\n",a1.getName(),a2.getName() );
            a2.setLive(false);
        }
        else {
            System.out.printf("%s đấm vỡ mồm %s\n",a2.getName(),a1.getName() );
            a1.setLive(false);
        }
    }

}
