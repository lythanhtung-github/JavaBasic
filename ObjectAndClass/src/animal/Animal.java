package animal;

public class Animal {
    private String name;
    private String sound;
    private double weight;

    public Animal() {
        this.name = "Dog";
        this.sound = "Gâu gâu";
        this.weight = 45.0;
    }

    public Animal(String name, String sound, double weight) {
        this.name = name;
        this.sound = sound;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Cân nặng không đúng");
        } else {
            this.weight = weight;
        }
    }

    public String speak() {
        return this.name
                + " speak "
                + this.sound
                + ", weight is "
                + this.weight;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        System.out.println(dog.speak());

        Animal cat = new Animal("Cat", "Meo meo", 50.0);
        System.out.println(cat.speak());

        cat.setName("Doraemon");
        System.out.println(cat.speak());

        cat.setSound("Nobitaaaaaaaaaa");
        System.out.println(cat.speak());


        System.out.println("------------------------");
        cat.setWeight(-1.0);
    }
}