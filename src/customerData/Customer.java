package customerData;

public class Customer {

    private String name;
    private String address;
    private String email;
    private long mobileNo;
    private boolean membership = false;


    public Customer() {
    }
    public Customer(String Name,String Address,String email,int mobileNo,boolean membership) {
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
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return  name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public  void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public long getMobileNo() {
        return  mobileNo;

    }
    public void isMembership(boolean membership) {
        this.membership = membership;
    }
    public  boolean isMembership() {
        return membership;
    }
}
