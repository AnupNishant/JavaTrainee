package JavaTraineeAssessment;

//import java.util.Scanner;
//import java.util.IOException;


public class AccountDetails {

	
	long accNumber;
	double balance;
	String Name;

	  public AccountDetails(long accNum, double bal, String nam) 
	  {
	      accNumber = accNum;
		  balance = bal;
		  Name = nam; 
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AccountDetails ad= new AccountDetails(635635, 233454, "Ramu");
     System.out.println(ad.accNumber + ad.balance + ad.Name);
     ad.show();
	}
}
