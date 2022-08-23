package test_interface;

public class Main {
    public static void main(String[] args) {
        Carnivores loc = new Carnivores("Lộc Shadow");
        System.out.println(loc.toString());
        loc.setName("Lộc phuho");
        System.out.println(loc.toString());

        Carnivores quy = new Carnivores("Quý Doggy");
        System.out.println(quy.toString());

        Herbivore khanh = new Herbivore("Khanh");
        System.out.println(khanh.toString());

        Tree sunFlower = new Tree("Hoa Hướng Dương");
        System.out.println(sunFlower.toString());
    }
}
