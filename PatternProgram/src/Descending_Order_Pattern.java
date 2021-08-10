import java.util.*;
import java.io.*;

public class Descending_Order_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number=5;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=n;j>i-1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
