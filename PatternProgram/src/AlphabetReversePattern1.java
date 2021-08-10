import java.util.*;
import java.io.*;

public class AlphabetReversePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=65;i<65+n;i++){
			for(int space=65;space<i;space++){
				System.out.print(" ");
			}
			for(int j=i;j<65+n;j++){
				System.out.print((char)i);
			}
			System.out.println();
		}
	}

}
