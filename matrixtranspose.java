package sample;

import java.util.Scanner;

public class matrixtranspose {
	
	public static void main(String[]args) {
		
			
			Scanner sc=new Scanner(System.in);
			int i,j,row,col;
			System.out.println("enter the row and coloumn of matrix");
			row=sc.nextInt();
			col=sc.nextInt();
			int [][]matrix=new int[row][col];
			int [][]transposeMatrix=new int[col][row];
			System.out.println("enter the value of array");
			for(i=0;i<row;i++) {
				for(j=0;j<col;j++) {
					matrix[i][j]=sc.nextInt();
				}
			}
			if(row!=col)
				System.out.println("invalid order");
			else
			{
				System.out.println("the transposed matrix:");
				for(i=0;i<row;i++) {
					for(j=0;j<col;j++) {
						transposeMatrix[i][j]=matrix[j][i];
						System.out.print(transposeMatrix[i][j]+"  ");
					}
					System.out.println();	
				}	
			}

}
}
