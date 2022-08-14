package access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

//    private double getRadius(){ // dùng trong lớp
//        return this.radius;
//    }
//
//    private String getColor(){
//        return this.color;
//    }

//    public double getRadius(){  //dùng ở mọi nơi
//        return this.radius;
//    }
//
//    public String getColor(){
//        return this.color;
//    }

    protected double getRadius(){  //dùng ở lớp cha và con
        return this.radius;
    }

    protected String getColor(){
        return this.color;
    }

//    double getRadius(){   //dùng trong package
//        return this.radius;
//    }
//
//    String getColor(){
//        return this.color;
//    }
}
