package hw3;

public abstract class Employee implements Comparable<Employee> {
    private String birthDay;
    private int salary;

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        return this.getBirthDay().compareTo(e.getBirthDay());
    }



}
