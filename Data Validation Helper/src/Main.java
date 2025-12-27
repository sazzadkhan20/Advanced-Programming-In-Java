import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a Email: ");
        Scanner scr = new Scanner(System.in);
        String email = scr.nextLine();
        String status = FormValidator.EmailHelper.validateEmail(email);
        //System.out.println(status);
        if(status.equals("valid"))
            System.out.println("Valid Email Address");
        else if(status.equals("blocked"))
            System.out.println("Provided Domain Blocked by System");
        else
            System.out.println("InValid Email Address");

    }
}