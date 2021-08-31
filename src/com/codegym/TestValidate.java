package com.codegym;

public class TestValidate {
    private static ValidatePhoneNumber validatePhoneNumber;

    public static final String[] validPhoneNumber = new String[] { "84-978489648"};
    public static final String[] invalidPhoneNumber = new String[] { "a8-22222222" };

    public static void main(String args[]) {
        validatePhoneNumber = new ValidatePhoneNumber();
        for (String PhoneNumber : validPhoneNumber) {
            boolean isvalid = validatePhoneNumber.validate(PhoneNumber);
            System.out.println("PhoneNumber is " + PhoneNumber +" is valid: "+ isvalid);
        }
        for (String PhoneNumber : invalidPhoneNumber) {
            boolean isvalid = validatePhoneNumber.validate(PhoneNumber);
            System.out.println("PhoneNumber is " + PhoneNumber +" is valid: "+ isvalid);
        }
    }
}
