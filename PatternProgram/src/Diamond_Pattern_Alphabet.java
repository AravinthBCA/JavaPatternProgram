import java.util.*;
import java.io.*;

public class Diamond_Pattern_Alphabet {

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
				if(l==1||l==i){
					System.out.print((char)(i+64)+" ");
				}
				else{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=n;j>=i;j--){
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++){
				if(l==1||l==i){
					System.out.print((char)(i+64)+" ");
				}
				else{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
