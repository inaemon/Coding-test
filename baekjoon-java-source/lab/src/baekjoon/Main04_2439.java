package baekjoon;

import java.util.Scanner;

// ���� �����2
public class Main04_2439 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		n = input.nextInt();	// �� n��
		for(int i=0; i<n; i++) {
			for(int j=n; j>0; j--) {
				if(j <= i+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
