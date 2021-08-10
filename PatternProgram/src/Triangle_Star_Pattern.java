import java.util.*;
import java.io.*;

public class Triangle_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,e=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++,e=0){
			for(int space=1;space<=n-i;space++){
				System.out.print(" ");
			}
			for(e=1;e<=i*2-1;e++){
				if(e==1||e==i*2-1||i==n){
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
