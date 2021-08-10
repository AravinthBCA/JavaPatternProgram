import java.util.*;
import java.io.*;

public class ReverseXPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int rows;
		System.out.println("Enter the number of rows: ");
		rows=in.nextInt();
		for(int i=rows;i>=1;i--){
			for(int spaces=0;spaces<=rows-i;spaces++){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
