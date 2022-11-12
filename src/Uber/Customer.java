package Uber;

public class Customer {
    String address;
    int paymentInfo;
    String name;
    int phoneNumber;
    String email;

    public Customer(String newAddress, int newPaymentInfo, String newName, int newPhoneNumber, String newEmail){
        address = newAddress;
        paymentInfo = newPaymentInfo;
        name = newName;
        phoneNumber = newPhoneNumber;
        email = newEmail;
    }
}

