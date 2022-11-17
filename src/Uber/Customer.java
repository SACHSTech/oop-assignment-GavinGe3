package Uber;
import java.util.*;

public class Customer {
    private String address;
    private int paymentInfo;
    private String name;
    private double phoneNumber;
    private String email;

    public Customer(){
    }

    public void setInfo(){
        Scanner scanner = new Scanner(System.in);

        String newAddress;
        int newPaymentInfo;
        String newName;
        double newPhoneNumber;
        String newEmail;

        System.out.print("Enter your address: ");
        newAddress = scanner.nextLine();
        address = newAddress;

        System.out.print("Enter your credit card number: ");
        newPaymentInfo = Integer.parseInt(scanner.nextLine());
        paymentInfo = newPaymentInfo;


        System.out.print("Enter your name: ");
        newName = scanner.nextLine();
        name = newName;

        System.out.print("Enter your phone number: ");
        newPhoneNumber = Double.parseDouble(scanner.nextLine());
        phoneNumber = newPhoneNumber;

        System.out.print("Enter your email: ");
        newEmail = scanner.nextLine();
        email = newEmail;
        }
    }


