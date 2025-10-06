import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Yusif", 101, 2000, "Java"));
        employees.add(new Developer("Elvin", 102, 2200, "Python"));
        employees.add(new Manager("Aysel", 103, 3000, 5));
        employees.add(new Manager("Rashad", 104, 3500, 8));

        for (Employee emp : employees) {
            System.out.println(emp);
            emp.work();
            System.out.println("Bonus: " + emp.calculateBonus());
        }
    }
}
