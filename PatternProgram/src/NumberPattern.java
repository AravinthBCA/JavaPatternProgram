import java.util.*;
import java.io.*;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=n;i>0;i--){
			for(int j=i;j<=n;j++){
				System.out.print(j);
			}
			for(int k=1;k<i;k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
