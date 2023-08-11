package baekjoon;

import java.util.Scanner;

// 백준 나머지
// https://www.acmicpc.net/problem/10430
public class Main03조건문1{
	public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   int H, M;	// Hour, Minute
	   
	   H = input.nextInt();
	   M = input.nextInt();
	   
	   if(!(0 <= H && 23 >= H)) {
		   return;
	   }
	   
	   if(!(0 <= M && 59 >= M)) {
		   return;
	   }
	   
	   // 45분 일찍
	   if(M >= 45) {
		   M = M - 45;
	   }else {
		   M = M + 60 - 45;
		   H -= 1;
	   }
	   
	   if(H < 0) {
		   H += 24;
	   }
	   
	   System.out.println(H + " " + M);
	}
}