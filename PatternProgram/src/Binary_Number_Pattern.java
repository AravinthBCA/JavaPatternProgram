import java.util.*;
import java.io.*;

public class Binary_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2==0){
				number=0;
				for(int j=1;j<=n;j++){
					System.out.print(number);
					number=(number==0)?1:0;
				}
				System.out.println();
			}
			else{
				number=1;
				for(int j=1;j<=n;j++){
					System.out.print(number);
					number=(number==0)?1:0;
				}
				System.out.println();
			}
		}
	}

}
