package Ex2;

public class Customer implements DiscountRate {
    String customerName;
    String customerType;

    public Customer(String name) {
        this.customerName = name;
        this.customerType = "Normal";
    }
    public Customer(String name, String type) {
        this.customerName = name;
        this.customerType = type;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getServiceMemberDiscount() {
        return 1;
    }
    public double getProductMemberDiscount() {
        return 1;
    }
}
