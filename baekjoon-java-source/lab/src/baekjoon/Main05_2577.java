package baekjoon;

import java.util.Scanner;

/*
 * 백준 2577번 숫자의 개수
 * https://www.acmicpc.net/problem/2577
 */
public class Main05_2577 {
	
	public static void main(String[] args) {
		int A, B, C;
		String product;
		char digit;
		int digits[] = new int[10];
		
		/* input */
		Scanner input = new Scanner(System.in);
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		
		product = A*B*C + "";
		
		// A, B, C 곱의 결과값은 0, 1, ..., 9가 몇개 들어있는 지 분석
		// <M1> product 길이만큼 for문 돌리기
		// <M2> 언제 끝날지 모르면 일단 while문
		for(int i=0; i<product.length(); i++) {
			digit = product.charAt(i);
			switch(digit) {
			case '0': digits[0] += 1; break;
			case '1': digits[1] += 1; break;
			case '2': digits[2] += 1; break;
			case '3': digits[3] += 1; break;
			case '4': digits[4] += 1; break;
			case '5': digits[5] += 1; break;
			case '6': digits[6] += 1; break;
			case '7': digits[7] += 1; break;
			case '8': digits[8] += 1; break;
			case '9': digits[9] += 1; break;
			}
		}
		
		/* output */
		for(int i=0; i<digits.length; i++) {
			System.out.println(digits[i]);
		}
	}
}
