package baekjoon;

import java.util.Scanner;

/*
 * 이 파일은 작성만하고 아직 백준 안 돌려봄ㅋ
 * 백준 돌리고 객지프에 올리기!!!!!!
 */

/*
 * 백준 14681 사분면 고르기
 * https://www.acmicpc.net/problem/14681
 */
public class Main03조건문_14681 {

	 public static void main(String[] args) {
		 // 사분면 좌표 저의
		 int xi = -1000;
		 int xf = 1000;
		 int yi = -1000;
		 int yf = 1000;
		 
		 int x, y;
		 
		 Scanner input = new Scanner(System.in);
		 
		 // 사용자가 좌표 입력
		 x = input.nextInt();
		 y = input.nextInt();
		 
		 // 알 수 없는 좌표
		 if(x == 0 || x < -1000 || x > 1000) {
			 return;
		 }
		 if(y == 0 || y < -1000 || y > 1000) {
			 return;
		 }
		 
		 if(x > 0) {
			 if(y > 0) {
				 System.out.println("1");	// 1사분면
			 }else {
				 System.out.println("4");	// 4사분면
			 }
		 }else {
			 if(y > 0) {
				 System.out.println("2");	// 2사분면
			 }else {
				 System.out.println("3");	// 3사분면
			 }
		 }
	 }
}
