package com.kodluyoruzpatikadev.UserLogin;

import java.util.Scanner;

public class UserLoginMain {
    public static void main(String[] args) {
        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your userName: ");
        userName = input.nextLine();

        System.out.println("Enter your password: ");
        password = input.nextLine();

        if(userName.equals("patikadev") && password.equals("java101")){
            System.out.println("Login successful");
        }
        else {
            System.out.println("The username or password is incorrect please try again");

            System.out.println("Forgot your password? If you want to change your password press 1 you don't want 2");
            Scanner choice = new Scanner(System.in);
            int value = choice.nextInt();

            switch (value) {
                case 1 -> {
                    System.out.println("Enter your password: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java101")) {
                        System.out.println("Could not create password, please enter another password.");
                    } else
                        System.out.println("Password changed");
                }
                case 2 -> System.out.println("You have not changed your password");
                default -> System.out.println("you made a wrong choice please try again");
            }

        }
    }
}
