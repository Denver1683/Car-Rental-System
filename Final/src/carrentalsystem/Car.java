package carrentalsystem;
public class Car {
    private String id;
    private Customer owner;
    private String rentDate;
    private String returnDate;
    private int fees;
    private String status;
    
    public Car(String id, Customer owner, String rentDate, String returnDate, int fees, String status) {
        this.id = id;
        this.owner = owner;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.fees = fees;
        this.status = status;
    }
    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Customer getOwner() {
        return owner;
    }
    public void setOwner(Customer owner) {
        this.owner= owner;
    }    
    public String getRentDate(){
        return rentDate;
    }
    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }
    public String getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public int getFees(){
        return fees;
    }
    public void setFees(int fees) {
        this.fees = fees;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}

    