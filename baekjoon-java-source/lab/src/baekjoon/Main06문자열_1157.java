package baekjoon;

import java.util.Scanner;

/*
 * 백준 1157번 단어공부
 * https://www.acmicpc.net/problem/1157
 * - 단어 입력
 * - 대소문자 구분없이 가장 많이 사용된 알파벳을 대문자로 출력
 * - 가장 많이 사용된 알파벳이 2개 이상일 경우 '?' 출력
 */
public class Main06문자열_1157 {
	
	public static void main(String[] args) {
		/*
		 * 정답으로 맞긴 했는데
		 * 무식하게 코드짬 ㅠㅠ 완전 하수급 코드임.
		 * 알고리즘 구현 필요
		 */
		String str;
		int[] alphabet = new int['Z'-'A'+1];
		Scanner input = new Scanner(System.in);
		
		str = input.next();
		str = str.toUpperCase();	// All 대문자로
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			// 해당 사전적 순서 위치의 문자열 칸의 값을 +1
			alphabet[c-'A'] ++;
		}
		
		int max = 0;	// 제일 많은 alphabet의 수
		int a = 0;		// 중복
		int index = 0;	// 해당 alphabet의 index
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
