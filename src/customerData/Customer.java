package customerData;

public class Customer {

    private String name;
    private   String address;
    private String email;
    private int mobileNo;
    private boolean membership;


    Customer() {
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
}
