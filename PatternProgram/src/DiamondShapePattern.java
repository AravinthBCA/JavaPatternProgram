import java.util.*;
import java.io.*;

public class DiamondShapePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++,k=0){
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			while(k!=i*2-1){
				System.out.print("*");
				++k;
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--,k=0){
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			while(k!=i*2-1){
				System.out.print("*");
				++k;
			}
			System.out.println();
		}
	}

}
