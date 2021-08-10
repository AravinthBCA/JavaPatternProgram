import java.util.*;
import java.io.*;

public class NormalPattern {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int matrix,n=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the matris limit :");
		matrix=in.nextInt();
		
		for(int i=0;i<matrix;i++){
			for(int j=0;j<matrix;j++){
				System.out.print(n);
			}
			System.out.println();
		}
	}	
}
