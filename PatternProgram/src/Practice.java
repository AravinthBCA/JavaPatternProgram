import java.util.*;
import java.io.*;
//hii
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--){
				System.out.print(k);
			}
			for(int l=2;l<=i;l++){
				System.out.print(l);
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--){
				System.out.print(k);
			}
			for(int l=2;l<=i;l++){
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
