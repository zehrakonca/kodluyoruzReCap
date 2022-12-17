package kullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName;
		String password;
		String answer; 
		String newPassword;
		
		String user1UserName = "monkeydluffy";
		String user1Password = "greatpirate";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your username: ");
		userName = input.nextLine();
		
		System.out.println("please enter your password: ");
		password = input.nextLine();
		
		if(userName.equals(user1UserName) && password.equals(user1Password))
		{
			System.out.println("you entered in system with successful.");
		}
		else if(!userName.equals(user1UserName)) {
			System.out.println("your username is unvalid. please check your information.");
		}
		else if(!password.equals(user1Password)){
			System.out.println("your password is unvalid. please check your information or you have to reset your password. do you want to reset your password? \n"
					+ "(if you want reset your password please write 'yes', if you dont want reset password please write 'no' and try again.) ");
			answer= input.nextLine();
			
			if(answer.equals("yes")) {
				System.out.println("please enter new password.");
				newPassword = input.nextLine();
				
				if(newPassword.equals(user1Password)) {
					System.out.println("your entered password cannot be same old password. please check your information.");
				}
				else {
					System.out.println("your password has been updated.");
				}
			}
			else {
				System.out.println("you choose -no-. so please try again access to system. good luck.");
			}
		}
		input.close();
		
	}

}
