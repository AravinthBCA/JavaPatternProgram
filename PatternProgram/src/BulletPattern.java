import java.util.*;
import java.io.*;

public class BulletPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Limit values: ");
		limit=in.nextInt();
		for(int i=0;i<limit;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=limit-1;i>=0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
