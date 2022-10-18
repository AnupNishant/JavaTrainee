package JavaTraineeAssessment;

public class CountArrayDupli {

		
		public static void main(String[] args) {
			
			int i = 0, j, dup_count = 0;
			int[] Dup_Count_arr = {25,35,25,65,65,34,87,67,34,25,99,88,65};
			
			while(i < Dup_Count_arr.length) 
			{
				j = i + 1;
				while(j < Dup_Count_arr.length)
				{		
					if(Dup_Count_arr[i] == Dup_Count_arr[j]) {
						dup_count++;
						break;
					}
					j++;
				}
				i++;
			}
			System.out.println("\nThe Total Number of Duplicates  = " + dup_count);
		}

}
