//Find the number is positive,negative or zero
package Numbers;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = obj.nextInt();
        if (num>0) {
        	System.out.print(num+" is positive number");
        } else if (num<0) {
        	System.out.print(num+" is negative number");
        } else {
        	System.out.print(num+" is zero");
        }
	}

}
