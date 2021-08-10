import java.util.*;
import java.io.*;

public class Downward_Triangl_Star_Pattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		n=in.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
