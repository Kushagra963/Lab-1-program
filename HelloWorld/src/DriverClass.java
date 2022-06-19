import java.util.Scanner;
public class DriverClass {
	
	public static void main(String args[]) {
		
		
		
		System.out.println("PLease enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. legal");
		
		Scanner sc = new Scanner(System.in);
		
		int  k = sc.nextInt();
		
		
		System.out.println("Enter Your  name ");
		
		String firstname = sc.next().toLowerCase();
		
		String lastname = sc.next().toLowerCase();
		
		
		
		System.out.println("Enter your company name");
		
		String companyName = sc.next().toLowerCase();
		
		
		String department ="";
		
		Employee e1 = new Employee();
		
		CredentialService cs = new CredentialService();
		
		e1.Employee(firstname,lastname);
		
		
		switch(k) {
		
		case 1:
			
			department = "Tech";
			break;
			
		case 2:
			
			department  = "Admin";
			break;
			
		case 3:
			
			department = "HR1";
			break;
		
		case 4:
			
			department = "legal";
			break;
			
		
		default :
			 
			   System.out.println("Entered choice is invalid");
			
			break;
			
		}
		
		
	String email = " ";
	
//	char c[];
	
	char c[] = cs.generatepassword();
	
	  email  =	cs.generateEmailAddress(firstname, lastname, department,companyName);
	 
	 
//	 System.out.println("Generated email is " +  email);
	 
	 
	 cs.showCredentials(email,c);

			
			
		
		
	}

}
