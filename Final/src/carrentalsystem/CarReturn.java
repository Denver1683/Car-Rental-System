package carrentalsystem;
public class CarReturn {
    private Customer owner;
    private String id;
    private String rentDate;
    private String returnDate;
    private int fees;
    private int delayedDays;
    private int fine;
    private String collect;
    public CarReturn(Customer owner,String id,String rentDate,String returnDate,int fees,int delayedDays,int fine, String collect) {
        this.owner = owner;
        this.id = id;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.fees = fees;
        this.delayedDays = delayedDays;
        this.fine = fine;
        this.collect= collect;
    }
    public Customer getOwner(){
        return owner;
    }
    public void setOwner(Customer owner) {
        this.owner = owner;
    }
    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public int getDelayedDays(){
        return delayedDays;
    }
    public void delayedDays(int delayedDays){
        this.delayedDays = delayedDays;
    }
    public int getFine(){
        return fine;
    }
    public void setFine(int fine) {
        this.fine = fine;
    }
    public void setCollect(String collect) {
        this.collect = collect;
    }
    public String getCollect() {
        return collect;
    }
}
