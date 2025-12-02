package proj1;

import java.util.Scanner;

public class PasswordStrengthChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String pwd = sc.nextLine();
		boolean[] arr = new boolean[5];
		if(pwd.length()>=8)
			arr[0] = true;
		for(int i = 0; i < pwd.length(); i++) {
			char ch = pwd.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				arr[1] = true;
			else if(ch >= 'a' && ch <= 'z')
				arr[2] = true;
			else if(ch >= '0' && ch <= '9')
				arr[3] = true;
			else
				arr[4] = true;
		}
		int criteria = 0;
		for(boolean val : arr)
			if(val)
				criteria++;
		if(criteria <=2)
			System.out.println("password strength: Weak");
		else if(criteria <= 4)
			System.out.println("password strength: Medium");
		else
			System.out.println("password strength: Strong");
		sc.close();

	}

}
