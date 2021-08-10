
import java.util.*;
import java.io.*;

public class XPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		int size,k;
		
		System.out.println("Enter your string: ");
		str=in.nextLine();    //to get the string
		
		size=str.length();     //to find the length of the string
		
		System.out.println("Your Output is: ");
		
		if(size%2==0){    //to check the string is odd is not valid 
			                //only even string allowed
			System.out.println("Enter the odd string");
			return;
		}
		k=size;       //to store the size of string in variable k
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				
				if(i==j){       //this is for first print of a column
					
					System.out.print(str.charAt(i));
					
					if(i==size/2){   //if i == 2 is true decrease the k value 
//because this is k value is 3 to print next row of k is 2 k values is a but 
//we want the value is r because this stage you decrease the k value
						--k;
					}
				}
				else if(i+j==size-1){   //this is for last print of a column
					
					System.out.print(str.charAt(--k));
				}
				else{
					System.out.print(" ");  // otherwise is empty space
				}
			}
			System.out.println();
		}
		
	}

}
