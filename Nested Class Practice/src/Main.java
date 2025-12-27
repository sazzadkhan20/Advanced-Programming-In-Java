import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Temparature As a Celcius Scale: ");
        Scanner scr = new Scanner(System.in);
        float celcius = scr.nextFloat();

        //Use Static Nested Class
        System.out.println("Converted Temperature: "+ Temperature.Converter.celciusToFarenheit(celcius));

        //Use NonStatic Nested Class
        NonStaticNested t = new NonStaticNested();
        NonStaticNested.Converter c= t.new Converter();
        System.out.println("Converted Temperature: "+ c.celciusToFarenheit(celcius));

        t.fun("sdsf","qwer","qwere","wewwe");

    }
}