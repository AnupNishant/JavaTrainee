package JavaTraineeAssessment;

import anup.TestThrows;

public class ArithmeticExp {

	public static int divideNum(int x, int y) throws ArithmeticException{
		int div = x / y;
		return div;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThrows obj = new TestThrows();
		try {
			System.out.println(obj.divideNum(44, 0));
		}
		catch(ArithmeticException e) {
			System.out.println("Number can't be divided by 0");
		}
		
	}

}
