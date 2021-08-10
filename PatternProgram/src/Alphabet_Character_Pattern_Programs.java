import java.util.*;
import java.io.*;

public class Alphabet_Character_Pattern_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=65;i<65+n;i++){
			for(int j=65;j<=i;j++){
				System.out.print((char)i+" ");
			}
			System.out.println();
		}
	}

}
