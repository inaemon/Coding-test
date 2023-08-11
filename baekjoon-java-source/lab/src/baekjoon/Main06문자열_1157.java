package baekjoon;

import java.util.Scanner;

/*
 * ���� 1157�� �ܾ����
 * https://www.acmicpc.net/problem/1157
 * - �ܾ� �Է�
 * - ��ҹ��� ���о��� ���� ���� ���� ���ĺ��� �빮�ڷ� ���
 * - ���� ���� ���� ���ĺ��� 2�� �̻��� ��� '?' ���
 */
public class Main06���ڿ�_1157 {
	
	public static void main(String[] args) {
		/*
		 * �������� �±� �ߴµ�
		 * �����ϰ� �ڵ�« �Ф� ���� �ϼ��� �ڵ���.
		 * �˰��� ���� �ʿ�
		 */
		String str;
		int[] alphabet = new int['Z'-'A'+1];
		Scanner input = new Scanner(System.in);
		
		str = input.next();
		str = str.toUpperCase();	// All �빮�ڷ�
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			// �ش� ������ ���� ��ġ�� ���ڿ� ĭ�� ���� +1
			alphabet[c-'A'] ++;
		}
		
		int max = 0;	// ���� ���� alphabet�� ��
		int a = 0;		// �ߺ�
		int index = 0;	// �ش� alphabet�� index
		for(int i=0; i<alphabet.length; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				index = i;
			}else if(alphabet[i] == max) {
				a = max;
			}
		}
		
		if(a == max) {
			System.out.println("?");
		}else {
			System.out.println((char)('A'+index));
		}
	}
}
