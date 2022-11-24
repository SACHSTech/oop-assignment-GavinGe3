package bigDonalds;
import java.util.*;

/**
 * Customer class, which stores a customers info
 * @author G. Ge
 * 
 */

public class Customer {
    // Class variables
    private String strAddress;
    private int intPaymentInfo;
    private String strName;
    private double dblPhoneNumber;
    private String strEmail;

    /**
     * Allows user to enter their info 
     * 
     */
    public void setInfo(){

        // Initialize scanner obj
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String newstrAddress;
        int newintPaymentInfo;
        String newstrName;
        double newdblPhoneNumber;
        String newstrEmail;

        // Allow user to enter info
        System.out.print("Enter your Address: ");
        newstrAddress = scanner.nextLine();
        strAddress = newstrAddress;

        System.out.print("Enter your credit card number: ");
        newintPaymentInfo = Integer.parseInt(scanner.nextLine());
        intPaymentInfo = newintPaymentInfo;

        System.out.print("Enter your Name: ");
        newstrName = scanner.nextLine();
        strName = newstrName;

        System.out.print("Enter your phone number: ");
        newdblPhoneNumber = Double.parseDouble(scanner.nextLine());
        dblPhoneNumber = newdblPhoneNumber;

        System.out.print("Enter your Email: ");
        newstrEmail = scanner.nextLine();
        strEmail = newstrEmail;
        }

        /**
         * Display customer info to the screen
         */
        public void showInfo(){
            System.out.println("---Customer Info---");
            System.out.println("Address: " + strAddress);
            System.out.println("Credit Card Number: " + intPaymentInfo);
            System.out.println("Name: " + strName); 
            System.out.println("Phone Number: " + dblPhoneNumber);
            System.out.println("Email: " + strEmail);
        }
    }


