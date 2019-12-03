import java.util.Scanner;

public class caesarCipher {	//Input funny Fallout New Vegas pun here

/*************************************************Main method that aquires user input******************************************************/
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
				Encrypt = false;
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
		
		System.out.println("What is the desired shift key?");
		shiftKey = in.nextInt();
		
		System.out.println("Please enter your message you would like Encrypted/Decrypted (letters only!)");
		do {	//do while loop fixes issue where program would completely skip user input and declare the message string as an enter key
			message = in.nextLine().trim();
		} 
		while(message.length() == 0);
		
		encryptionCodec(message,Encrypt,Decrypt,shiftKey);
		
		in.close();	//closes Scanner
	} 	//end main method
/******************************************************************************************************************************************/
/*******************************************Method that encrypts and decrypts user messages************************************************/
	public static void encryptionCodec(String message,boolean Encrypt, boolean Decrypt, int shiftKey) {	//method encrypts and decrypts messages
		String newMessage = "";
		int j,index;
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(j = 0; j < message.length(); j++) {
			if('a' <= message.charAt(j) && message.charAt(j) <= 'z'){
				index = (message.charAt(j) - 'a');
				if(Encrypt == true) {
					newMessage += alphabet[(index + shiftKey) % alphabet.length];
				}
				else if(Decrypt == true) {
					newMessage += alphabet[(index - shiftKey + alphabet.length) % alphabet.length];
				}
			}
			else {
				newMessage += message.charAt(j);
			}
		}
		
		System.out.println(newMessage);
		
	}
/******************************************************************************************************************************************/
}	//end class
