package customerData;

public class Customer {

    private String name;
    private   String address;
    private String email;
    private int mobileNo;
    private boolean membership;


    public Customer() {
        String Name;
        String Address;
        String email;
        int mobileNo;
        boolean membership;
    }
    Customer(String Name,String Address,String email,int mobileNo,boolean membership) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.membership = membership;
        this.mobileNo = mobileNo;

    }
    public void displayCustomerDetails() {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("email = " + email);
        System.out.println("mobileNo = " + mobileNo);
        System.out.println("membership = " + membership);
    }
}
