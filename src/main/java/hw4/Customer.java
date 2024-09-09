package hw4;

public class Customer {
    enum Gender {FEMALE, MALE};
    private Object gender;
    private String name;

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
