import java.util.*;
import java.io.*;

public class Sandglass_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=0;i<n;i++){
			for(int space=0;space<=i;space++){
				System.out.print(" ");
			}
			for(int j=n;j>i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++){
			for(int space=i;space<n;space++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
