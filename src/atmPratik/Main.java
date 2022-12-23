package atmPratik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password;
        Scanner input = new Scanner(System.in);
        int tryRight = 3;
        int balance = 3000;
        int select;
        while (tryRight > 0) {
            System.out.print("please enter username:");
            userName = input.nextLine();
            System.out.print("please enter password : ");
            password = input.nextLine();

            if (userName.equals("monkeydluffy") && password.equals("greatpirate")) {
                System.out.println("Hello! Welcome to the Pirate Bank!");
                do {
                    System.out.println("1-i want to deposit money.\n" +
                            "2-i want to withdraw money.\n" +
                            "3-i want to find out balance.\n" +
                            "4-i want to quit.");
                    System.out.print("please choose you what you want: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("amount of money : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("amount of money : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("insufficient balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("your balance : " + balance);
                    }
                } while (select != 4);
                System.out.println("see you soon. "+userName);
                break;
            } else {
                tryRight--;
                System.out.println("your username or password is possibly wrong.");
                if (tryRight == 0) {
                    System.out.println("your account is blocked. please call the bank call center.");
                } else {
                    System.out.println("your remaining right : " + tryRight);
                }
            }
        }

	}

}
