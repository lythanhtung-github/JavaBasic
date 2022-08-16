package animal;

public class Animal {
    private String name;
    private String sound;

    public Animal(){

    }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
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

    public String speak(){
        return this.name + " speak " + this.sound;
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Cat", "Meo meo");
        System.out.println(cat.speak());
    }
}
