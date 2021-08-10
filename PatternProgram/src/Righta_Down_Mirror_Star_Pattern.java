import java.util.*;
import java.io.*;

public class Righta_Down_Mirror_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		n=in.nextInt();
		for(int i=n;i>=1;i--){
			for(int space=n;space>i;space--){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
