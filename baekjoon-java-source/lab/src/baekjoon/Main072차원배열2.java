package baekjoon;

import java.util.Scanner;

/*
 * https://www.codeup.kr/problem.php?id=1476&rid=0
 * 
 * 2차원 배열을 거꾸로 채우기
 * 
 * 다음과 같은 n*m 배열 구조를 출력해보자.
 * 
 * 입력이 3 4인 경우 다음과 같이 출력한다.
 * 12 9 6 3
 * 11 8 5 2
 * 10 7 4 1
 * 
 * 입력이 4 5인 경우는 다음과 같이 출력한다.
 * 20 16 12 8 4
 * 19 15 11 7 3
 * 18 14 10 6 2
 * 17 13 9 5 1
 * 
 * 입력이 n m인 경우의 2차원 배열을 출력해보자.
 * 
 * 
 */
public class Main072차원배열2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int count = n*m;
		
		int array[][] = new int[n][m];

		for(int j=0; j<m; j++) {		// 열
			for(int i=0; i<n; i++) {	// 행
				array[i][j] = count --;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
