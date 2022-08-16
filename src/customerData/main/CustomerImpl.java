package customerData.main;

import customerData.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        Customer object1 = new Customer();
        object1.displayCustomerDetails();
        Customer object2 = new Customer();
        object1.setName("Rohit_Narnaware");
        object1.setAddress("nagpur_111");
        object1.setEmail("rohit@1223");
        object1.setMobileNo(9975535222L);
        object1.isMembership(true);
        System.out.println("object1.getName() = " + object1.getName());
        System.out.println("object1.getAddress() = " + object1.getAddress());
        System.out.println("object1.getEmail() = " + object1.getEmail());
        System.out.println("object1.getMobileNo() = " + object1.getMobileNo());
        System.out.println("object1.isMembership() = " + object1.isMembership());

        object2.displayCustomerDetails();
        System.out.println("object2.getName() = " + object2.getName());
        System.out.println("object2.getAddress() = " + object2.getAddress());
        System.out.println("object2.getEmail() = " + object2.getEmail());
        System.out.println("object2.getMobileNo() = " + object2.getMobileNo());
        System.out.println("object2.isMembership() = " + object2.isMembership());



    }
}
