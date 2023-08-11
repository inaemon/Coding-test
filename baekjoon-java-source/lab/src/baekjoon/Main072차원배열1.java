package baekjoon;

import java.util.Scanner;

/*
 * https://www.codeup.kr/problem.php?id=1476&rid=0
 * 
 * 2���� �迭�� �������� ä���
 * �迭�� ���ݼ����� ä���
 * 
 * ������ ���� nxm �迭 ������ ����غ���.
 * 
 * �Է��� 3 4�� ��� ������ ���� ����Ѵ�.
 * 1 3 6 9
 * 2 5 8 11
 * 4 7 10 12
 * 
 * �Է��� 4 5�� ���� ������ ���� ����Ѵ�.
 * 1 3 6 10 14
 * 2 5 9 13 17
 * 4 8 12 16 19
 * 7 11 15 18 20
 * 
 * 
 */
public class Main072�����迭1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int count = 1;
		
		int array[][] = new int[n][m];
		
		for(int i=0; i<n+m -1; i++) {
			for(int j=0; j<m; j++) {		// ��
				for(int k=0; k<n; k++) {	// ��
					if(j+k == i) {
						array[k][j] = count++;
						break;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
