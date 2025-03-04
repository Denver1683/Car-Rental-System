package carrentalsystem;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DataIO {
    public static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
    public static ArrayList<NewCustomer> allNewCustomers = new ArrayList<NewCustomer>();
    public static ArrayList<Car> allCars = new ArrayList<Car>();
    public static ArrayList<CarRent> allCarsOwned = new ArrayList<CarRent>();
    public static ArrayList<CarReturn> allCarsReturned = new ArrayList<CarReturn>();
    public static ArrayList<Admin> allAdmin = new ArrayList<Admin>();
    public static ArrayList<Feedback> allFeedback = new ArrayList<Feedback>();
    public static ArrayList<NotificationService> allNotifications = new ArrayList<NotificationService>();
    public static void readFile(){
        try{
            Scanner s1 = new Scanner(new File("customer.txt"));
            while(s1.hasNext()){
                String username = s1.nextLine(); 
                String password = s1.nextLine();
                String gender = s1.nextLine();
                int age = Integer.parseInt(s1.nextLine());
                int phoneNum = Integer.parseInt(s1.nextLine());
                String email = s1.nextLine();
                String address = s1.nextLine();
                s1.nextLine();
                Customer c = new Customer(username,password,gender,age,phoneNum,email,address);
                allCustomers.add(c);
            }
            Scanner s2 = new Scanner(new File("car_rented.txt"));
            while(s2.hasNext()){
                String id = s2.nextLine();
                Customer username = verifyUsername(s2.nextLine());
                String rentDate = s2.nextLine();
                String returnDate = s2.nextLine();
                int fees = Integer.parseInt(s2.nextLine());
                String status = s2.nextLine();
                s2.nextLine();
                Car c = new Car(id, username, rentDate,returnDate,fees,status);
                allCars.add(c);
                username.getMyCar().add(c);
            }
            Scanner s3 = new Scanner(new File("car_list.txt"));
            while(s3.hasNext()){
                String brand = s3.nextLine();
                String model = s3.nextLine();
                String color = s3.nextLine();
                String id = s3.nextLine();
                int fee = Integer.parseInt(s3.nextLine());
                s3.nextLine();
                CarRent c = new CarRent(brand,model,color,id,fee);
                allCarsOwned.add(c);
            }
            Scanner s4 = new Scanner(new File("feedback.txt"));
            while(s4.hasNext()){
                Customer username = verifyUsername(s4.nextLine());
                int score = Integer.parseInt(s4.nextLine());
                String usermood = s4.nextLine();
                s4.nextLine();
                Feedback f = new Feedback(username,score,usermood);
                allFeedback.add(f);
            }
            Scanner s5 = new Scanner(new File("Admin.txt"));
            while(s5.hasNext()){
                String username = s5.nextLine();
                String password = s5.nextLine();
                s5.nextLine();
                Admin a = new Admin(username,password);
                allAdmin.add(a);
            }
            Scanner s6 = new Scanner(new File("newcustomer.txt"));
            while(s6.hasNext()){
                String username = s6.nextLine(); 
                String password = s6.nextLine();
                String gender = s6.nextLine();
                int age = Integer.parseInt(s6.nextLine());
                int phoneNum = Integer.parseInt(s6.nextLine());
                String email = s6.nextLine();
                String address = s6.nextLine();
                s6.nextLine();
                NewCustomer c = new NewCustomer(username,password,gender,age,phoneNum,email,address);
                allNewCustomers.add(c);
            }
            Scanner s7 = new Scanner(new File("Notification.txt"));
            while(s7.hasNext()){
                String username = s7.nextLine();
                String message = s7.nextLine();
                s7.nextLine();
                NotificationService c = new NotificationService(username,message);
                allNotifications.add(c);
            }
            Scanner s8 = new Scanner(new File("history.txt"));
            while(s8.hasNext()){
                Customer owner = verifyUsername(s8.nextLine());
                String id = s8.nextLine();
                String rentDate = s8.nextLine();
                String returnDate = s8.nextLine();
                int fees = Integer.parseInt(s8.nextLine());
                int delayedDays = Integer.parseInt(s8.nextLine());
                int fine = Integer.parseInt(s8.nextLine());
                String collect = s8.nextLine();
                s8.nextLine();
                CarReturn cr = new CarReturn(owner,id,rentDate,returnDate,fees,delayedDays,fine,collect);
                allCarsReturned.add(cr);
                owner.getReturnMyCar().add(cr);
            }
        }catch (Exception e) {
            System.out.println("Missing file(s) detected, please check your file(s)");
        }
    }
    public static void writeToTextFile(){
        try{
            PrintWriter a = new PrintWriter("customer.txt");
            for(Customer c : allCustomers){
                a.println(c.getUsername());
                a.println(c.getPassword());
                a.println(c.getGender());
                a.println(Integer.toString(c.getAge()));
                a.println(Integer.toString(c.getPhoneNum()));
                a.println(c.getEmail());
                a.println(c.getAddress());
                a.println();
            }
            a.close();
            PrintWriter b = new PrintWriter("car_rented.txt");
            for(Car c : allCars){
                b.println(c.getId());
                b.println(c.getOwner().getUsername());
                b.println(c.getRentDate());
                b.println(c.getReturnDate());
                b.println(Integer.toString(c.getFees()));
                b.println(c.getStatus());
                b.println();
            }
            b.close();
            PrintWriter d = new PrintWriter("car_list.txt");
            for(CarRent c : allCarsOwned){
                d.println(c.getBrand());
                d.println(c.getModel());
                d.println(c.getColor());
                d.println(c.getId());
                d.println(Integer.toString(c.getFees()));
                d.println();
            }
            d.close();
            PrintWriter e = new PrintWriter("feedback.txt");
            for(Feedback c: allFeedback){
                e.println(c.getOwner().getUsername());
                e.println(Integer.toString(c.getScore()));
                e.println(c.getUsermood());
                e.println();
            }
            e.close();
            PrintWriter f = new PrintWriter("Admin.txt");
            for(Admin c: allAdmin){
                f.println(c.getUsername());
                f.println(c.getPassword());
                f.println();
            }
            f.close();
            PrintWriter g = new PrintWriter("newcustomer.txt");
            for(NewCustomer c : allNewCustomers){
                g.println(c.getUsername());
                g.println(c.getPassword());
                g.println(c.getGender());
                g.println(Integer.toString(c.getAge()));
                g.println(Integer.toString(c.getPhoneNum()));
                g.println(c.getEmail());
                g.println(c.getAddress());
                g.println();
            }
            g.close();
            PrintWriter h = new PrintWriter("Notification.txt");
            for(NotificationService c : allNotifications){
                h.println(c.getUsername());
                h.println(c.getMessage());
                h.println();
            }
            h.close();
            PrintWriter i = new PrintWriter("history.txt");
            for(CarReturn c : allCarsReturned){
                i.println(c.getOwner().getUsername());
                i.println(c.getId());
                i.println(c.getRentDate());
                i.println(c.getReturnDate());
                i.println(Integer.toString(c.getFees()));
                i.println(Integer.toString(c.getDelayedDays()));
                i.println(Integer.toString(c.getFine()));
                i.println(c.getCollect());
                i.println();
            }
            i.close();
        }catch(Exception e){
            System.out.println("Error in write .....");
        }
    }
    
    public static ArrayList<String> getAllCustomers() {
        ArrayList<String> ac = new ArrayList<String>();
        for (Customer c: allCustomers){
            ac.add(c.getUsername());
        }
        return ac;
    }
    
    public static ArrayList<String> getAllCars() {
        ArrayList<String> ac = new ArrayList<String>();
        for (Car cr: allCars){
            ac.add(cr.getId());
        }
        return ac;
    }

    public static ArrayList<String> getAllCarsOwned() {
        ArrayList<String> ac = new ArrayList<String>();
        for (CarRent cr: allCarsOwned){
            ac.add(cr.getId());
        }
        return ac;
    }
    
    public static ArrayList<String> getAllAdmin() {
        ArrayList<String> ad = new ArrayList<String>();
        for (Admin a: allAdmin){
            ad.add(a.getUsername());
        }
        return ad;
    }
    
    public static ArrayList<String> getAllNewCustomers() {
        ArrayList<String> ac = new ArrayList<String>();
        for (NewCustomer c: allNewCustomers){
            ac.add(c.getUsername());
        }
        return ac;
    }
    
    public static ArrayList<String> getAllCarsReturned() {
        ArrayList<String> ac = new ArrayList<String>();
        for (CarReturn cr: allCarsReturned){
            ac.add(cr.getId());
        }
        return ac;
    }
    
    public static ArrayList<String> getAllCarsReturnedDate() {
        ArrayList<String> ac = new ArrayList<String>();
        for (CarReturn cr: allCarsReturned){
            ac.add(cr.getRentDate());
        }
        return ac;
    }

    public static ArrayList<String> getAllFeedback() {
        ArrayList<String> ac = new ArrayList<String>();
        for (Feedback cr: allFeedback){
            ac.add(Integer.toString(cr.getScore()));
        }
        return ac;
    }
    
    public static Customer verifyUsername(String username){
        Customer found = null;
        for(Customer c : allCustomers){
            if(username.equals(c.getUsername())){
                found = c;
                break;
            }
        }
        return found;
    }
    
    public static NewCustomer verifyNewUsername(String username){
        NewCustomer found = null;
        for(NewCustomer c : allNewCustomers){
            if(username.equals(c.getUsername())){
                found = c;
                break;
            }
        }
        return found;
    }
    
    public static Admin verifyAdmin(String username){
        Admin found = null;
        for(Admin c: allAdmin){
            if(username.equals(c.getUsername())){
                found = c;
                break;
            }
        }
        return found;
    }
    
    public static Car verifyID(String ID){
        Car found = null;
        for(Car c : allCars){
            if(ID.equals(c.getId())){
                found = c;
                break;
            }
        }
        return found;
    }
    
    public static Car UserOnRent(String Username){
        Car found = null;
        for(Car c : allCars){
            if(Username.equals(c.getOwner().getUsername())){
                found = c;
                break;
            }
        }
        return found;
    }
    
    public static CarRent findID(String ID){
        CarRent found = null;
        for(CarRent c : allCarsOwned){
            if(ID.equals(c.getId())){
                found = c;
                break;
            }
        }
        return found;
    }
    public static NotificationService getMessage (String username){
        NotificationService found = null;
        for(NotificationService c: allNotifications){
            if(username.equals(c.getUsername())){
                found = c;
                break;
            }
        }
        return found;
    }
    public static CarReturn verifyCar(String id){
        CarReturn found = null;
        for(CarReturn cr : allCarsReturned){
            if(id.equals(cr.getId())){
                found = cr;
                break;
            }
        }
        return found;
    }
    public static CarReturn verifyCarwDate(String id, String RentDate){
        CarReturn found = null;
        for(CarReturn cr : allCarsReturned){
            if(id.equals(cr.getId())&&RentDate.equals(cr.getRentDate())){
                found = cr;
                break;
            }
        }
        return found;
    }
}
