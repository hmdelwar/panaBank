package Utils;

import com.github.javafaker.Faker;


public class GlobalVariables {
    static String fname;
    static String lname;
    static String zip;
    static String number;
    static String social;

    public static String getSt() {
        return st;
    }

    static String st;

    public static String getUserName() {
        return userName;
    }

    public static String getFname() {
        return fname;
    }

    public static String getLname() {
        return lname;
    }

    public static String getZip() {
        return zip;
    }

    public static String getNumber() {
        return number;
    }

    public static String getSocial() {
        return social;
    }

    public static String getPassWord() {
        return passWord;
    }

    public static String[] getAddie() {
        return addie;
    }

    static String userName;
    static String passWord;

    static String addie [];

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    String accNumber;


    public static void variableDeclaration() {
        Faker fake = new Faker();
        fname = fake.name().firstName();
        lname = fake.name().lastName();
        //addie = fake.address().fullAddress();
        addie = fake.address().fullAddress().split(",");
        st = fake.address().state();
        zip = fake.address().zipCode();
        number = fake.numerify("##########");
        social = fake.numerify("#########");
        userName = fake.name().username()+fname;
        passWord = fname+zip;
        System.out.println(userName+ " " + passWord);
    }
}
