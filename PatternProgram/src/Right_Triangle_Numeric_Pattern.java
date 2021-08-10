import java.util.*;
import java.io.*;

public class Right_Triangle_Numeric_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=i;k>=1;k--){
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
