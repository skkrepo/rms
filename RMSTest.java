/* Java program to find maximum product of N adjacent numbers  in M x N  matrix
 *  @Author :Sudhir Kulkarni
 *  @Date : 12 MARCH 2019
 *  @Ver: 1.0
 *  
 */

public class RMSTest {
     
	
	public static int FindMaxProduct(int matrix[][], int consecutive, int matrixHeight, int matrixWidth)
	{
		
		int max = 0, temp_max = 0, max_x = 0, max_y = 0;
		String direction = "";
		 for (int i = 0; i < matrixHeight; i++){
			 
			                 for (int j = 0; j < matrixWidth; j++){
			 
			                 //Check right
			 
			                         if (j < (matrixWidth - consecutive)){
			 
			                                 temp_max = 1;
			 
			                                 for (int k = 0; k < consecutive; k++){
			 
			                                         temp_max *= matrix[i][j+k];
			 
			                                 }
			 
			                                 if (temp_max > max){
			 
			                                         max = temp_max;
			
			                                         max_x = j;
			 
			                                         max_y = i;
			 
			                                         direction = "right";
			 
			                                  }
			
			                         }
			 
			                 // Check down
			 
			                         if (i < (matrixWidth - consecutive)){
			 
			                                 temp_max = 1;
			 
			                                 for (int k = 0; k < consecutive; k++){
			 
			                                         temp_max *= matrix[i+k][j];
			 
			                                 }
			 
			                                 if (temp_max > max){
			 
			                                         max = temp_max;
			 
			                                         max_x = j;
			 
			                                         max_y = i;
			 
			                                         direction = "down";
			 
			                                 }
			 
			                         }
			 
			                 //Check down-right
			 
			                         if ((i < (matrixHeight - consecutive)) && (j < (matrixWidth - consecutive))){
			 
			                                 temp_max = 1;
			 
			                                 for (int k = 0; k < consecutive; k++){
			 
			                                         temp_max *= matrix[i+k][j+k];
			 
			                                 }
			 
			                                 if (temp_max > max){
			 
			                                         max = temp_max;
			 
			                                         max_x = j;
			 
			                                         max_y = i;
			 
			                                         direction = "diagonal down right";
			 
			                                 }
			 
			                         }
			 
			                 //Check up-right
			 
			                         if ((i > consecutive) && (j < (matrixWidth - consecutive))){
			 
			                                 temp_max = 1;
			 
			                                 for (int k = 0; k < consecutive; k++){
			 
			                                         temp_max *= matrix[i-k][j+k];
			 
			                                 }
			 
			                                 if (temp_max > max){
			 
			                                         max = temp_max;
			 
			                                         max_x = j;
			 
			                                         max_y = i;
			 
			                                         direction = "diagonal up right";
			 
			                                 }
			 
			                         }
			 
			                 }
			 
			         }

		   System.out.println("Maximum Product of adjacent numbers is:  "+ max);
		   System.out.println("It is found at x:" +max_x+"   y:"+max_y);
		   System.out.println("Direction of Adjacent number is " +direction);
		
		return max;
			
		
	}
	
	
	
	
	//Driver code 
	public static void main(String[] args) 
	{ 
		 int adjacentNumLenght = 3;

		/* int arr[][] = {{6, 2, 3, 4}, 
						{5, 4, 3, 1}, 
						{7, 4, 5, 6}, 
						{8, 3, 1, 0}};  */
		 
		/* int arr[][] = {{1, 2, 1, 3, 4}, 
						{5, 6, 3, 9, 2}, 
						{7, 8, 8, 1, 2}, 
						{1, 0, 7, 9, 3}, 
						{3, 0, 8, 4, 9}};*/

		/*int arr[][] = {{1, 2, 3, 4, 5}, 
					  {6, 7, 8, 9, 1}, 
					  {2, 3, 4, 5, 6}, 
					  {7, 8, 9, 1, 0}, 
					  {9, 6, 4, 2, 3}}; */
		
	 int arr[][] = {{8 ,2, 22, 97, 38, 15, 0, 40, 0, 75},
			       {49 ,49 ,99, 40, 17, 81, 18, 57, 60, 87},
			       {81, 49, 31, 73, 55, 79, 14, 29, 93, 71},
			       {52 ,70, 95, 23, 4 ,60 ,11 ,42 ,69 ,24},
			       {22, 31, 16, 71, 51, 67, 63, 89, 41, 92},
			       {24, 47, 32, 60, 99, 3, 45, 2, 44, 75},
			       {32, 98, 81, 28, 64, 23, 67, 10, 26, 38},
			       {67, 26 ,20, 68, 2 ,62 ,12, 20, 95, 63},
			       {24, 55, 58, 5 ,66, 73, 99, 26, 97, 17},
			       {21, 36, 23, 9 ,75, 0, 76, 44, 20, 45}};
	
	   System.out.println("Array Length "+ arr.length);
	   System.out.println(" Adjacent number length "+adjacentNumLenght);
	   
	  System.out.print(FindMaxProduct(arr,adjacentNumLenght,arr.length,arr.length )); 
	} 
}
