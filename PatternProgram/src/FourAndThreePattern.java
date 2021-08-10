import java.util.*;
import java.io.*;


public class FourAndThreePattern {
	
	FourAndThreePattern(){
		int n,i=0,j=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		n = in.nextInt();
		for(i=0;i<n;i++){
			if(i==j || i==n-1){
				for(j=0;j<n;j++){
					System.out.print(" "+n+" ");
			     }
			}
			else{
//				System.out.print();
				System.out.print(" "+n+" ");
				System.out.print(" ");
				for(int k=1;k<=n/2;k++){          // it returns 2 digits
					System.out.print(n-1+" ");   //it prints 3 two times
					System.out.print(" ");
				}
				System.out.print(n+" ");
			}
			
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourAndThreePattern obj = new FourAndThreePattern();
	}

}
