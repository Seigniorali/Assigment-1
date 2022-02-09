package com.company;
import kotlin.text.UStringsKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Validator valid = new Validator();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your firstname:");
        String firstName = console.nextLine();
        System.out.println("Enter your surname:");
        String secondName = console.nextLine();
        System.out.println("Enter your gender:");
        String gender = console.nextLine();
        System.out.println("Enter your birthdate (dd/mm/yyyy):");
        String date = console.nextLine();
        System.out.println("Enter your password:");
        String password = console.nextLine();
        System.out.println("Enter your age:");
        int age = console.nextInt();
        User Data = new User(firstName, secondName, age, gender, password, date);
        if(!valid.checkAge(Data.getAge())){
            System.out.println("Age less than 18!");
        };
        if(!valid.checkDate(Data.getDateOfBirth())){
            System.out.println("Wrong date format!");
        }
        if(!valid.checkPassword(Data.getPassword())){
            System.out.println("Wrong password!");
        }
    }
}
