import java.util.Scanner;

public class caesarCipher {	//Input funny Fallout New Vegas pun here

	public static void main(String[] args) {
		String message;	//string for the users message they want encrypted/decrypted
		int shiftKey, cipherPath; //shiftKey is self explanatory. cipherPath on the other hand, is the int that decides which way the cipher works
		boolean Encrypt = false;	
		boolean Decrypt = false;	
		boolean Running = true;	//boolean value for input validation
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Greetings! Would you like to encrypt or decrypt a message? \n1. Encrypt \n2. Decrypt");
		
		while(Running == true) {	//while loop for input validation
			cipherPath = in.nextInt();
			
			if(cipherPath == 1) {
				Encrypt = true;
				Running = false;
			}
			else if(cipherPath == 2) {
				Decrypt = true;
				Running = false;
			}
			else {
				System.out.println("Invalid! Please try again");
			}
		}	//end while loop
		
		System.out.println("Please enter your message you would like Encrypted/Decrypted");
		do {	//do while loop fixes issue where program would completely skip user input and declare the message string as an enter key
			message = in.nextLine().trim();
		} while(message.length() == 0);
		
		in.close();	//closes Scanner
	} 	//end main method
	
}	//end class
