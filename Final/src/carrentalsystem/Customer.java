package carrentalsystem;
import java.util.ArrayList;
public class Customer{
    private String username;
    private String password;
    private String gender;
    private int age;
    private int phoneNum;
    private String email;
    private String address;
    private String rentId;
    private String returnId;
    private ArrayList<Car> myCar = new ArrayList<Car>();
    private ArrayList<CarReturn> returnMyCar = new ArrayList<CarReturn>();
    
    public Customer(String username, String password, String gender, int age, int phoneNum, String email, String address){
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getPhoneNum(){
        return phoneNum;
    }
    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getRentId(){
        return rentId;
    }
    public String getReturnId(){
        return returnId;
    }
    public ArrayList<Car> getMyCar() {
        return myCar;
    }
    public void setMyCar(ArrayList<Car> myCar) {
        this.myCar = myCar;
    }    
        public ArrayList<CarReturn> getReturnMyCar() {
        return returnMyCar;
    }
    public void setReturnMyCar(ArrayList<CarReturn> returnMyCar) {
        this.returnMyCar = returnMyCar;
    }  
}
 
