import java.util.*;
import java.io.*;

public class RightSideTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		n=in.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=1;j<=n;j++){
				if(j>=i){
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
