package Login_Registration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Registration obj = new Registration();
		//obj.registration("Yash", "Rawat", "yash123", "yash@123", "1234567890", "yash@gmail.com", "Boulevard Street,Bhopal","CYGAZ8549M","698585714489","Savings","Male","BusinessMan");
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("     ✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥   Welcome  ✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥✥      ");
		System.out.println();
		System.out.printf("   ➨  1. Registration   \n  \n   ➨  2. Login ");
		int ch =sc.nextInt();
		
		 switch(ch) {
		 case 1:
			 System.out.println("Enter your First Name ✍");
			 String First_name=sc.next();
			 System.out.println("Enter your Last  Name ✍");
			 String last_name=sc.next();
			 System.out.println("Enter your userName  ✍");
			 String userName=sc.next();
			 System.out.println("Enter your password ✍");
			 String password=sc.next();
			 System.out.println("Enter your Re_enter password ✍");
			 String re_pass=sc.next();
			 System.out.println("Enter your Mobile Number ✍");
			 String mobile_No =sc.next();
			 System.out.println("Enter your Email ✉");
			 String email=sc.next();
			 System.out.println("Enter your Address ✍");
			 String address=sc.next();
			 System.out.println("Enter your Pancard ✍");
			 
			 String pancard=sc.next();
			 
			 System.out.println("Enter your Adhaar Card ✍");
			 String adhaar_card=sc.next();
			 System.out.println("Select your  Account ✍");
			 System.out.printf("           ➡ 1. Saving   \n           ➡ 2. Current ");
			 int acc_ch =sc.nextInt();
			 switch(acc_ch) {
			 case 1:
				 String acc_type ="Saving";
				 break;
			 case 2:
				  acc_type ="Current";
				 break;
			default:
				System.out.println("          😭😭😭😭😭   Select valid options     😭😭😭😭😭😭        ");
				break;
			 }
			 System.out.println("Select your  Gender ✍");
			 System.out.printf("  ➡ 1. Male  \n  ➡ 2. Female   \n  ➡ 3. Transgender");
			 int gen_ch=sc.nextInt();
			 switch(gen_ch) {
			 case 1:
				 String gender = "Male";
				 break;
			 case 2:
				 gender = "Female";
				 break;
			 case 3:
				 gender = "Trangender";
				 break;
			default:
				System.out.println("          😭😭😭😭😭   Select valid options     😭😭😭😭😭😭        ");
				break;
			 }
			 System.out.println("Enter your Occupation ✍");
			 String occupation =sc.next();
			 System.out.println("Code ends");
			 break;
			 //login function
		 case 2:
			 System.out.println();
			 System.out.println("Enter your UserName ✍");
			 userName=sc.next();
			 System.out.println("Enter your password ✍");
			 password=sc.next();
			 boolean v = obj.login(userName,password);
				//System.out.println(v);
			 if(v) {System.out.println("Successful login");}
			 else {
			 System.out.println("Forget Your Password ✍"); 
			 System.out.printf("        ➡  1. Yes ✔  \n        ➡  2. No  ✘");
			 int f_ch =sc.nextInt();
			 switch(f_ch) {
			 case 1:
				 break;
			 case 2:
				 break;
			 default:
				 System.out.println("          😭😭😭😭😭   Select valid options     😭😭😭😭😭😭        ");
				 break;
			 	}
			 }
			 break;
		default:
			System.out.println("          😭😭😭😭😭   Select valid options     😭😭😭😭😭😭        ");
			break;
		 }
	}

}
