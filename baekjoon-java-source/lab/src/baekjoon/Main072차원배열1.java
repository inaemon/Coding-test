package baekjoon;

import java.util.Scanner;

/*
 * https://www.codeup.kr/problem.php?id=1476&rid=0
 * 
 * 2차원 배열을 빗금으로 채우기
 * 배열을 빗금순으로 채우기
 * 
 * 다음과 같은 nxm 배열 구조를 출력해보자.
 * 
 * 입력이 3 4인 경우 다음과 같이 출력한다.
 * 1 3 6 9
 * 2 5 8 11
 * 4 7 10 12
 * 
 * 입력이 4 5인 경우는 다음과 같이 출력한다.
 * 1 3 6 10 14
 * 2 5 9 13 17
 * 4 8 12 16 19
 * 7 11 15 18 20
 * 
 * 
 */
public class Main072차원배열1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int count = 1;
		
		int array[][] = new int[n][m];
		
		for(int i=0; i<n+m -1; i++) {
			for(int j=0; j<m; j++) {		// 열
				for(int k=0; k<n; k++) {	// 행
					if(j+k == i) {
						array[k][j] = count++;
						break;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
