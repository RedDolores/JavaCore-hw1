package hw3;

import java.util.List;

public class Boss extends Employee{


    public void upSalary (List<Employee> listEmployee, int sumUp){
        for (Employee e:listEmployee) {
            if(e.getClass() == Worker.class){
                e.setSalary(e.getSalary() + sumUp);
            }
        }
    }
}
