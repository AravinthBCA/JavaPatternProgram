import java.util.*;
import java.io.*;

public class Diamond_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=1;k<2*(i-1);k++){
				System.out.print(" ");
			}
			if(i==1){
				System.out.print("");
			}
			else{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=1;k<2*(i-1);k++){
				System.out.print(" ");
			}
			if(i==1){
				System.out.print("");
			}
			else{
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}
