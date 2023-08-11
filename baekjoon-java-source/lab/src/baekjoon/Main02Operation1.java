package baekjoon;

import java.util.Scanner;

// ���� ����� �Ѱ���
// https://www.acmicpc.net/problem/4344
/*
 * �Ʒ� ��ü �����ؼ� input�ϸ� ��
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
 */
public class Main02Operation1{
	public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   int testCase;	// ���� ����
	   int n;			// �л� ��
	   double[] meanOverArray;	// ����� �Ѵ� �л� ����
	   
	   testCase 	 = input.nextInt();
	   meanOverArray = new double[testCase];
	   
	   // ���� �Է¹ް� ��� ���ϱ�
	   for(int i=0; i<testCase; i++) {	// �� ���踶�� ��� ���
		   double mean;	// �������
		   double[] meanArray;
		   
		   n = input.nextInt();	// ���� ���� (�л� ��)
		   meanArray = new double[n];
		   mean = 0;
		   
		   for(int j=0; j<n; j++) {
			   meanArray[j] = input.nextInt();
			   mean += meanArray[j];	// �ϴ� �л��� ���� �� ��ġ��
		   }
		   mean = mean / n;	// ���
		   
		   meanOverArray[i] = 0;
		   for(int j=0; j<n; j++) {
			   if(meanArray[j] > mean) {	// ������ = �ʰ� O, �̻� X
				 meanOverArray[i] ++;  
			   }
		   }
		   meanOverArray[i] = meanOverArray[i] /n *100;
	   }
	   
	   // �� class���� ��� ���
	   for(int i=0; i<testCase; i++) {
		   System.out.printf("%.3f", meanOverArray[i]);
		   System.out.print("% \n");
	   }
	}
}