import java.util.*;
import java.io.*;

public class Triangle_Character_Pattern_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++){
				System.out.print((char)(l+64)+" ");
			}
			System.out.println();
		}
	}

}
