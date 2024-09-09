package hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<>();
        Boss boss = new Boss();
        boss.setSalary(100);
        Employee worker1 = new Worker();
        worker1.setSalary(100);
        Employee worker2 = new Worker();
        worker2.setSalary(100);
        Employee worker3 = new Worker();
        worker3.setSalary(100);

        listEmployee.add(boss);
        listEmployee.add(worker1);
        listEmployee.add(worker2);
        listEmployee.add(worker3);

        boss.upSalary(listEmployee,100);
        System.out.println(boss.getSalary());
        System.out.println(worker1.getSalary());
        System.out.println(worker2.getSalary());
        System.out.println(worker3.getSalary());


    }
}
