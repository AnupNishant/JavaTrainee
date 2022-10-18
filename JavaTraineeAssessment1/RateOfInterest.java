package JavaTraineeAssessment;


public class Bank{
	float i = 8.0f;
	void getRateOfInterest() {
		System.out.println();
		}
}
class SBI extends Bank{
	float Si = 8.0f;
	void getRateOfInterest() {
		System.out.println("SBI Interest = " + Si+"%"); 
	  }
}
class ICICI extends Bank{
	    float Ic = 7.0f;
		void getRateOfInterest() {
			System.out.println("ICICI Interest = " + Ic+"%");
			}
		}
		
class AXIS extends Bank{
	float Ax = 9.0f;
	void getRateOfInterest() {
		System.out.println("AXIS Interest = " + Ax+"%"); 
	   }
}
public class RateOfInterest {
	
	public static void main(String[] args) {
		SBI S1 = new SBI();
		ICICI I1 = new ICICI();
		AXIS A1 = new AXIS();
		S1.getRateOfInterest();
		I1.getRateOfInterest();
		A1.getRateOfInterest();
		
	}
}

