package baekjoon;

import java.util.Scanner;

// ���� ����
// https://www.acmicpc.net/problem/2588
public class Main02Operation2{
	public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   int num1;
	   int num2;
	   int temp;
	   int multif;
	   
	   num1 = input.nextInt();
	   num2 = input.nextInt();
	   multif = 0;
	   
	   /*
	    * i=10		: num2�� 1�� �ڸ��� (10���� ���� ��������) num1�� ��� �ڸ����� ��
	    * i=100		: num2�� 10�� �ڸ��� (100���� ���� ��������) num1�� ��� �ڸ����� ��
	    * i=1000	: num2�� 100�� �ڸ��� (1000���� ���� ��������) num1�� ��� �ڸ����� ��
	    */
	   for(int i=10; i<10000; i*=10) {		// �� �ڸ� ���� 1�� �ڸ�, 10�� �ڸ�, 100�� �ڸ�
		   temp = num1 * (num2%i/(i/10));	// num1�� num2�� i/10�� �ڸ��� ��
		   multif += temp*i/10;
		   
		   // (num2%i)			: �ش� �ڸ��� ���� ��� ��
		   // (num2%i/(i/10)	: �� �ش� �ڸ�����
//		   System.out.println(num2%i+"  "+num2%i/(i/10));
		   System.out.println(temp);
	   }
	   System.out.println(multif);
	}
}