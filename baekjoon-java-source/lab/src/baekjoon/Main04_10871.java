package baekjoon;

import java.util.Scanner;

// 백준 X보다 작은 수
public class Main04_10871 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, x;
		int[] array;
		
		n = input.nextInt();	// 수열의 크기
		x = input.nextInt();	// 기준 값
		
		// 정의역
		if(!(1<=n)) {
			return;
		}
		if(!(x<=10000)) {
			return;
		}
		
		// 수열 A를 이루는 정수  입력받기
		array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = input.nextInt();
			
			if(!(1<=array[i] && array[i]<=10000)) {
				return;
			}
		}
		
		// X보다 작은 수 출력
		for(int i=0; i<n; i++) {
			if(array[i] < x) {
				System.out.print(array[i]+" ");
			}
		}
	}
}
