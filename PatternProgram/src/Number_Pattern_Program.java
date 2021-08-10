import java.util.*;
import java.io.*;

public class Number_Pattern_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}
