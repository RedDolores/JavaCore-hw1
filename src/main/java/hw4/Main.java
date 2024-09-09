package hw4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customerW1 = new Customer();
        Customer customerW2 = new Customer();
        Customer customerW3 = new Customer();
        Customer customerM1 = new Customer();
        Customer customerM2 = new Customer();

        customerW1.setGender(Customer.Gender.FEMALE);
        customerW1.setName("customerW1");
        customerW2.setGender(Customer.Gender.FEMALE);
        customerW2.setName("customerW2");
        customerW3.setGender(Customer.Gender.FEMALE);
        customerW3.setName("customerW3");
        customerM1.setGender(Customer.Gender.MALE);
        customerM1.setName("customerM1");
        customerM2.setGender(Customer.Gender.MALE);
        customerM2.setName("customerM2");

        List<Customer> customers = new ArrayList<>();
        customers.add(customerW1);
        customers.add(customerW2);
        customers.add(customerW3);
        customers.add(customerM1);
        customers.add(customerM2);

        congratulation(customers, "01.01");
        congratulation(customers, "08.03");
        congratulation(customers, "23.02");
        congratulation(customers, "15.06");


    }
    public static void congratulation (List<Customer> customers, String date){
        for (Customer customer : customers) {
            if (date.equals(Holidays.NEW_YEAR.holiday)) {
                System.out.println(customer.getName() + ", Happy New Year!");
            }
            else if (date.equals(Holidays.WORLD_WOMEN_S_DAY.holiday)){
                if (customer.getGender() == Customer.Gender.FEMALE){
                    System.out.println(customer.getName() + ", Happy World Women's Day!");
                }
            }
            else if (date.equals(Holidays.DEFENDER_OF_THE_FATHERLAND_DAY.holiday)){
                if (customer.getGender() == Customer.Gender.MALE){
                    System.out.println(customer.getName() + ", Happy Defender Of The Fatherland Day!");
                }
            }
            else{
                System.out.println(customer.getName() + ", it's a regular day.");
            }
        }
    }
}
