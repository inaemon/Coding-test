package baekjoon;

import java.util.Scanner;

/*
 * https://www.codeup.kr/problem.php?id=1476&rid=0
 * 
 * 2���� �迭�� �Ųٷ� ä���
 * 
 * ������ ���� n*m �迭 ������ ����غ���.
 * 
 * �Է��� 3 4�� ��� ������ ���� ����Ѵ�.
 * 12 9 6 3
 * 11 8 5 2
 * 10 7 4 1
 * 
 * �Է��� 4 5�� ���� ������ ���� ����Ѵ�.
 * 20 16 12 8 4
 * 19 15 11 7 3
 * 18 14 10 6 2
 * 17 13 9 5 1
 * 
 * �Է��� n m�� ����� 2���� �迭�� ����غ���.
 * 
 * 
 */
public class Main072�����迭2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int count = n*m;
		
		int array[][] = new int[n][m];

		for(int j=0; j<m; j++) {		// ��
			for(int i=0; i<n; i++) {	// ��
				array[i][j] = count --;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
