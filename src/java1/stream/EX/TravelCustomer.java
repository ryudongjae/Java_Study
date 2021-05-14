package java1.stream.EX;

public class TravelCustomer {

    private String customerName;
    private int customerAge;
    private int price;

    public TravelCustomer(String customerName, int customerAge, int price) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.price = price;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getCustomerAge() {
        return customerAge;
    }
    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "여행객 명단 {" +
                "customerName='" + customerName + '\'' +
                ", customerAge=" + customerAge +
                ", price=" + price +
                '}';
    }
}
