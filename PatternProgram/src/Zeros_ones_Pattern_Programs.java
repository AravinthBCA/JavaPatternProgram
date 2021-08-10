import java.util.*;
import java.io.*;

public class Zeros_ones_Pattern_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(j%2==0){
					number=0;
					System.out.print(number);
				}
				else{
					number=1;
					System.out.print(number);
				}
			}
			System.out.println();
		}
	}

}
