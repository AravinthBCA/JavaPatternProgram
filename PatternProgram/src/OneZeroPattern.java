import java.util.*;
import java.io.*;

public class OneZeroPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n,m=0;
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=0;i<n;i++){
			m=i;
			for(int j=0;j<n;j++){
				System.out.print(m%2);
				m++;
			}
			System.out.println();
		}
	}

}
