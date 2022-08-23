package test_interface;

public class Herbivore extends Animal implements MyInterface {
    public Herbivore(String name) {
        super(name);
    }

    @Override
    public String eat() {
        return "là động vật ăn cỏ";
    }

    @Override
    public String saySomeThing() {
        return "thích ăn cỏ";
    }

    @Override
    public String toString() {
        return super.getName() + " " + this.eat() + "," + this.saySomeThing() + " và " + MESSAGE;

    }
}
