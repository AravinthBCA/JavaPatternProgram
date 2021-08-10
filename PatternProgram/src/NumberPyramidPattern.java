import java.util.*;
import java.io.*;

public class NumberPyramidPattern {
	
	NumberPyramidPattern(){
		int rows,num=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		rows=in.nextInt();
		for(int i=0;i<rows;i++){
			for(int j=0;j<rows-i-1;j++){
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)+1;j++){
				if(j<=i)
				{
					System.out.print(++num);
				}
				else
				{
					System.out.print(--num);
				}
			}
			num+=i;
			System.out.println();
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPyramidPattern obj=new NumberPyramidPattern();

	}

}
