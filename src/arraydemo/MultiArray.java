package arraydemo;

//Demo for multidimensional array implementation
public class MultiArray {

	public static void main(String[] args) {
		
		//Declaration+Initialization
		//array name [row][column]
		int matrix[][]= {{12,22,34},{24,15,36},{37,28,19}};
		System.out.println("The matrix is");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			
		 }
		
		

	}

}
