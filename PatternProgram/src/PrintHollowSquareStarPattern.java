import java.util.*;
import java.io.*;

public class PrintHollowSquareStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the matrix limit : ");
		limit=in.nextInt();
		for(int i=0;i<limit;i++){
			for(int j=0;j<limit;j++){
				if((i==0 || j==0)||(i==limit-1 || j==limit-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
