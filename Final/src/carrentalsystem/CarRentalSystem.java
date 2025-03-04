package carrentalsystem;
public class CarRentalSystem {
    public static Customer loginUser = null;
    public static Customer editUser = null;
    public static NewCustomer newUser = null;
    public static CarRent editCar = null;
    public static Admin editAdmin = null;
    public static Car editRentedCar = null;
    public static CarReturn editReturnedCar = null;
    public static void main(String[] args) {
        DataIO.readFile();
        new HomePage().setVisible(true);
    }
}



