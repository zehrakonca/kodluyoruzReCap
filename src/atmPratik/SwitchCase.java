package atmPratik;

import java.util.Scanner;

public class SwitchCase {

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
            int price;

            if (userName.equals("monkeydluffy") && password.equals("greatpirate")) {
                System.out.println("Hello! Welcome to the Pirate Bank!");
                do {
                    System.out.println("1-i want to deposit money.\n" +
                            "2-i want to withdraw money.\n" +
                            "3-i want to find out balance.\n" +
                            "4-i want to quit.");
                    System.out.print("please choose you what you want: ");
                    select = input.nextInt();
                    
                    switch (select) {
					case 1:
						 System.out.print("amount of money : ");
	                     price = input.nextInt();
	                     balance += price;
						 break;
						 
					case 2:
						 System.out.print("amount of money : ");
	                        price = input.nextInt();
	                        if (price > balance) {
	                            System.out.println("insufficient balance.");
	                        } else {
	                            balance -= price;
	                            System.out.println("you have withdrawn "+ price+ ". now you have "+ balance +" beli in account.");
	                        }
	                        break;
					case 3:
						System.out.println("your balance : " + balance);
						break;
					default:
						break;
					}
                }
                while (select != 4);
                System.out.println("see you soon. "+userName);
                break;
            }
        }
	}

}
