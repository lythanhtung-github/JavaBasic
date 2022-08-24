import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    private final static Boolean MALE = true;
    private final static Boolean FEMALE = false;

    public static void main(String[] args) {
        Queue<Employee> maleEmployees = new LinkedList<>();
        Queue<Employee> femaleEmployees = new LinkedList<>();

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nguyễn Văn A", MALE, "15/02/1997"));
        employees.add(new Employee("Nguyễn Văn B", MALE, "16/02/1997"));
        employees.add(new Employee("Nguyễn Thị D", FEMALE, "17/01/1998"));
        employees.add(new Employee("Nguyễn Văn C", MALE, "17/02/1997"));
        employees.add(new Employee("Nguyễn Thị E", FEMALE, "01/02/1998"));
        employees.add(new Employee("Nguyễn Văn F", MALE, "18/02/1997"));

        for (Employee element : employees) {
            if (element.isGender()) {
                maleEmployees.add(element);
            } else {
                femaleEmployees.add(element);
            }
        }

        ArrayList<Employee> newEmployees = new ArrayList<>();
        while (femaleEmployees.size() != 0) {
            newEmployees.add(femaleEmployees.remove());
        }
        while (maleEmployees.size() != 0) {
            newEmployees.add(maleEmployees.remove());
        }
        newEmployees.forEach(employee -> System.out.println(employee.toString()));
    }

}


