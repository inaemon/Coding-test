package baekjoon;

import java.util.Scanner;

// ���� X���� ���� ��
public class Main04_10871 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, x;
		int[] array;
		
		n = input.nextInt();	// ������ ũ��
		x = input.nextInt();	// ���� ��
		
		// ���ǿ�
		if(!(1<=n)) {
			return;
		}
		if(!(x<=10000)) {
			return;
		}
		
		// ���� A�� �̷�� ����  �Է¹ޱ�
		array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = input.nextInt();
			
			if(!(1<=array[i] && array[i]<=10000)) {
				return;
			}
		}
		
		// X���� ���� �� ���
		for(int i=0; i<n; i++) {
			if(array[i] < x) {
				System.out.print(array[i]+" ");
			}
		}
	}
}
