import java.util.*;
import java.io.*;

public class LeftSideNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
