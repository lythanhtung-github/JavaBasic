package test_interface;

public class Tree implements MyInterface {
    private String name;

    public Tree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String saySomeThing() {
        return "là 1 loài hoa";
    }

    @Override
    public String toString() {
        return this.name + " " + this.saySomeThing() + " and " + MESSAGE + "\n";
    }
}
