package us.inest.app.epi.arrays;

/*
 * This problem was asked by Google.

*  In linear algebra, a Toeplitz matrix is one in which 
*  the elements on any given diagonal from top left to bottom right are identical.

Here is an example:

1 2 3 4 8
5 1 2 3 4
4 5 1 2 3
7 4 5 1 2
Write a program to determine whether a given input is a Toeplitz matrix.
 */
public class ToeplitzMatrix {
	public static boolean checkToepliz(int[][] matrix)
	{
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[0].length - 1; j++) {
				if (matrix[i][j] != matrix[i + 1][j + 1]) {
					return false;
				}
			}
		}

		return true;
	}


	public static void main(String[] args) {		
		/* int[][] matrix =
			{
				{ 3, 7, 0, 9 },
				{ 5, 3, 7, 0 },
				{ 6, 5, 3, 7 },
				{ 4, 6, 5, 3 }
			}; */

		int[][] matrix =
		{
			{ 1, 2, 3, 4, 8 },
			{ 5, 1, 2, 3, 4 },
			{ 4, 5, 1, 2, 3 },
			{ 7, 4, 5, 1, 2 }
		};
		
		if (checkToepliz(matrix)) {
			System.out.print("Is a Toepliz matrix");
		}
		else {
			System.out.print("Not a Toepliz matrix");
		}

	}

}
