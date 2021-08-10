import java.util.*;
import java.io.*;

public class Down_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=n;i>=1;i--){
			for(int space=0;space<n-i;space++){
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++){
				if(k==1||i==n||k==i*2-1){
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
