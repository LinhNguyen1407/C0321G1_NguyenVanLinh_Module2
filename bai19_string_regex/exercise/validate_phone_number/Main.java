package bai19_string_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneNumber phoneNumbers = new PhoneNumber();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a phone number: ");
            String phoneNumber = scanner.nextLine();
            if (phoneNumber.equals("q")) {
                break;
            }
            boolean isValid = phoneNumbers.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber +" is valid: "+ isValid);
        }
    }
}
