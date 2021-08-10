import java.util.*;
import java.io.*;

public class Left_Triangle_Pascals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=n;i>=1;i--){
			for(int space=i;space>=1;space--){
				System.out.print(" ");
			}
			for(int j=0;j<=(n-i);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int space=0;space<=n-i;space++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
