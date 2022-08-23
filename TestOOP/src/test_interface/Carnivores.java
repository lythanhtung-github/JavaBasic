package test_interface;

public class Carnivores extends Animal implements MyInterface {

    public Carnivores(String name) {
        super(name);
    }

    @Override //của lớp Animal
    public String eat() {
        return "là động vật ăn thịt";
    }

    @Override //interface MyInterface
    public String saySomeThing() {
        return "thích ăn gà 45kg";
    }

    @Override
    public String toString() {
        return super.getName() + " " + this.eat() + ", " + this.saySomeThing() + " và " + MESSAGE;
    }
}
