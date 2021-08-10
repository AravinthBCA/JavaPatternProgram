import java.util.*;
import java.io.*;

public class AlphabetReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(i=65;i<65+n;i++){
			for(int space=65;space<i;space++){
				System.out.print(" ");
			}
			for(j=i;j<65+n;j++){
				System.out.print((char)j);
			}
			j=66;
			System.out.println();
		}
	}

}
