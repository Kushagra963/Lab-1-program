import java.util.Random;

public class CredentialService {
	
	
	public char[] generatepassword() {
	
	
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	String smallLetters ="abcdefghijklmnopqrst";
	
	String numbers = "0123456789";
	
	String specialCharacters = "!@$%^&*()-+=?<>." ;
	
	
	String values = capitalLetters +  smallLetters + numbers + specialCharacters ;
	
	Random random = new Random();
	
	char [] password = new char[8];
	
	for(int i= 0 ; i < 8 ; i++) {
		
		password[i]= values.charAt(random.nextInt(values.length()));
		
		
	}
	     return password;
	}
	
	public String generateEmailAddress(String firstname , String lastname , String department,String company) {
		
		String EmailAddress =  firstname + lastname + "@" + department +"." + company + ".com" ;
		
		return EmailAddress ;
		
		
	}
	
	public void showCredentials(String EmailAddress , char[] password ) {
		
		
		System.out.println("Email --->" + EmailAddress);
		
		System.out.print("Password --->");
		
		for(int i =0 ; i < password.length;i++) {
			
			System.out.print(password[i]);
		}
		
		
		
		
		
	}
}
