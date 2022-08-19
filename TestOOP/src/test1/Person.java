//package test1;
//
//class Person{
//    String name;
//    Date birthday;
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setBirthday(Date birthday){
//        this.birthday = birthday;
//    }
//    public String getDetails(){
//        String detail = "";
//        detail = "Name: " + name + ", birthday: " + new SimpleDateFormat("MM-dd-yyyy").format(birthday);
//
//        return detail;
//    }
//}
//
//class Employee extends Person{
//    double salary;
//    public void setSalary(double salary){
//        this.salary = salary;
//    }
//    @Override
//    public String getDetails(){
//        String detail="";
//        detail = "Name: " + name + ", birthday: " + new SimpleDateFormat("MM-dd-yyyy").format(birthday) + ", salary: " + salary;
//
//        return detail;
//    }
//}
//
//class Main {
//    public static void main(String[] args) throws ParseException {
//        Person p1 = new Employee();
//        //down-casting
//        Employee e1 = (Employee) p1;
//        e1.setName("Henry");
//        e1.setBirthday(new SimpleDateFormat("MM-dd-yyyy").parse("12-31-1998"));
//        e1.setSalary(7000.0);
//        System.out.println(e1.getDetails());
//    }
//}
