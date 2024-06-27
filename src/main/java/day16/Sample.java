package day16;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            for (int k=1;k<i;k++)
                System.out.print(i);
            System.out.println(" ");
        }


	}

}
