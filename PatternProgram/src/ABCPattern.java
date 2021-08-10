import java.util.*;
import java.io.*;

public class ABCPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=0;
		char arr[]={'a','b','c','d','e'};
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		limit=in.nextInt();
		for(int i=0;i<limit;i++){
			for(int j=0;j<=i;j++){
				System.out.print((char)(65+j));
			}
			System.out.println();
		}
	}

}
