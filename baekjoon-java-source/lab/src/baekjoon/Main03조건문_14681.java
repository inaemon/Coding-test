package baekjoon;

import java.util.Scanner;

/*
 * �� ������ �ۼ����ϰ� ���� ���� �� ��������
 * ���� ������ �������� �ø���!!!!!!
 */

/*
 * ���� 14681 ��и� ����
 * https://www.acmicpc.net/problem/14681
 */
public class Main03���ǹ�_14681 {

	 public static void main(String[] args) {
		 // ��и� ��ǥ ����
		 int xi = -1000;
		 int xf = 1000;
		 int yi = -1000;
		 int yf = 1000;
		 
		 int x, y;
		 
		 Scanner input = new Scanner(System.in);
		 
		 // ����ڰ� ��ǥ �Է�
		 x = input.nextInt();
		 y = input.nextInt();
		 
		 // �� �� ���� ��ǥ
		 if(x == 0 || x < -1000 || x > 1000) {
			 return;
		 }
		 if(y == 0 || y < -1000 || y > 1000) {
			 return;
		 }
		 
		 if(x > 0) {
			 if(y > 0) {
				 System.out.println("1");	// 1��и�
			 }else {
				 System.out.println("4");	// 4��и�
			 }
		 }else {
			 if(y > 0) {
				 System.out.println("2");	// 2��и�
			 }else {
				 System.out.println("3");	// 3��и�
			 }
		 }
	 }
}
