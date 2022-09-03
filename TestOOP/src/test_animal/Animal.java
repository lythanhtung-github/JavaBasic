package test_animal;

public class Animal {
    private String name;
    private int power;
    private boolean isLive;

    public Animal() {
    }

    public Animal(String name, int power, boolean isLive) {
        this.name = name;
        this.power = power;
        this.isLive = isLive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", isLive=" + isLive +
                '}';
    }
}
