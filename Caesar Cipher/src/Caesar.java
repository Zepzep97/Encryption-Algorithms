import java.util.Scanner;

public class Caesar {	//Input funny Fallout New Vegas pun here

	public static void main(String[] args) {
		String message;
		int shiftKey, cipherPath; //shiftKey is self explanitory. cipherPath on the other hand, is the int that decides which way the cipher works
		boolean Encrypt = false;
		boolean Decrypt = false;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Greetings! Would you like to encrypt or decrypt a message? \n1. Encrypt \n2. Decrypt");
		cipherPath = in.nextInt();
		
		if(cipherPath == 1) {
			Encrypt = true;
		}
		else if(cipherPath == 2) {
			Decrypt = true;
		}
		else {
			System.out.println("Invalid! Please try again");
		}

		in.close();
	}

}
