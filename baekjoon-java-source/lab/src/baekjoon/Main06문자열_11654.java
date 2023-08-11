package baekjoon;

import java.util.Scanner;

/*
 * 백준 1157번 단어공부
 * https://www.acmicpc.net/problem/1157
 * - 단어 입력
 * - 대소문자 구분없이 가장 많이 사용된 알파벳을 대문자로 출력
 * - 가장 많이 사용된 알파벳이 2개 이상일 경우 '?' 출력
 */
public class Main06문자열_11654 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String c = input.next();
		
		System.out.println(0+c.charAt(0));
	}
}
