package test;

public class Person {
    private String name;
    private String email;
    private int age;


    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Tuổi không hợp lệ");
            return;
        }
        this.age = age;
    }

    public static void main(String[] args) {
        Person quy = new Person("Quy", "quydaigia@gmail.com", -8);
    }
}
