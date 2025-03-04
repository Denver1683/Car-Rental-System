package carrentalsystem;
public class Feedback {
    private Customer owner;
    private int score;
    private String usermood;
    
    public Feedback(Customer owner, int score, String usermood) {
        this.owner = owner;
        this.score = score;
        this.usermood = usermood;
    }
    public Customer getOwner() {
        return owner;
    }
    public void setOwner(Customer owner) {
        this.owner= owner;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getUsermood(){
        return usermood;
    }
    public void setUsermood(String usermood) {
        this.usermood = usermood;
    }
}
