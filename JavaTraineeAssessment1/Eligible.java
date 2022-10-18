package JavaTraineeAssessment;

import java.util.Scanner;

public class Eligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age:");
		int age= sc.nextInt();
		if(age<18)
		{
			System.out.println("Ineligible to VOTE or DRIVE");
		}
		else
		{
			System.out.println("Eligible to VOTE and DRIVE");
		}
	}

}
