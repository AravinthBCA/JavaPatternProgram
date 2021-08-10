import java.util.*;
import java.io.*;

public class Diamond_Numeric_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int space=1;space<i;space++){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int space=1;space<i;space++){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
