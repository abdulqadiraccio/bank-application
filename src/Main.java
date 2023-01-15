import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name, password, balance to create your account");
        String name= sc.next();
        String password = sc.next();
        double balance= sc.nextDouble();
        SBIUser user= new SBIUser(name,balance,password);
System.out.println("your account no. is  " +user.getAccountNo());

        String message=user.addMoney(10000);
        System.out.println(message);

        System.out.println("enter amount to withdraw");
        int money =sc.nextInt();

        System.out.println("enter password");
        String pass= sc.next();

        System.out.println(user.withDrawMoney(money,pass));
        System.out.println("your remaining balance is "+user.checkBalance());

        System.out.println("your interest is  " + user.calculateInterest(10));


    }
}