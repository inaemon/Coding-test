package baekjoon;

import java.util.Scanner;

// ¹éÁØ OXÄûÁî
public class Main05_8958 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;	// ¹Ýº¹ È½¼ö
		int[] score;
		
		n = input.nextInt();
		score = new int[n];
		while(n > 0) {
			String ox;
			int count;
			
			ox = input.next();
			score[score.length-n] = 0;
			count = 0;
			
			for(int i=0; i<ox.length(); i++) {
				if('O' == ox.charAt(i)) {
					count ++;
				}else {
					count = 0;
				}
				
				score[score.length-n] += count;
			}
			
			n--;
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
