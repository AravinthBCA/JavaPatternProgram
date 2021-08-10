import java.util.*;
import java.io.*;

public class StarPatternWithEmptySpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i,j;
		Scanner in=new Scanner(System.in);
		for(i=0;i<n;i++){
			for(j=0;j<n*2;j++){
				if(i+j<n){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				if(i+n<=j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(i=1;i<n;i++){
			for(j=0;j<n*2;j++){
				if(i>=j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				if(i>=(n*2-1)-j){
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
