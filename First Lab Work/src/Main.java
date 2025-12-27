import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String name,id,dept;
        name = scr.nextLine();
        id = scr.nextLine();
        dept = scr.nextLine();
        Student s1 = new Student(id,name,dept);
        s1.studentAllInfo();

        }
    }