package bigDonalds;
import java.util.*;

public class Customer {
    private String strAddress;
    private int intPaymentInfo;
    private String strName;
    private double dblPhoneNumber;
    private String strEmail;

    public Customer(){
    }

    public void setInfo(){

        Scanner scanner = new Scanner(System.in);

        String newstrAddress;
        int newintPaymentInfo;
        String newstrName;
        double newdblPhoneNumber;
        String newstrEmail;

        System.out.print("Enter your strAddress: ");
        newstrAddress = scanner.nextLine();
        strAddress = newstrAddress;

        System.out.print("Enter your credit card number: ");
        newintPaymentInfo = Integer.parseInt(scanner.nextLine());
        intPaymentInfo = newintPaymentInfo;

        System.out.print("Enter your strName: ");
        newstrName = scanner.nextLine();
        strName = newstrName;

        System.out.print("Enter your phone number: ");
        newdblPhoneNumber = Double.parseDouble(scanner.nextLine());
        dblPhoneNumber = newdblPhoneNumber;

        System.out.print("Enter your strEmail: ");
        newstrEmail = scanner.nextLine();
        strEmail = newstrEmail;
        }
    }


