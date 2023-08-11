package baekjoon;

import java.util.Scanner;

// 백준 평균은 넘겠지
// https://www.acmicpc.net/problem/4344
/*
 * 아래 전체 복사해서 input하면 됨
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
 */
public class Main02Operation1{
	public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   int testCase;	// 시험 개수
	   int n;			// 학생 수
	   double[] meanOverArray;	// 평균을 넘는 학생 비율
	   
	   testCase 	 = input.nextInt();
	   meanOverArray = new double[testCase];
	   
	   // 성적 입력받고 평균 구하기
	   for(int i=0; i<testCase; i++) {	// 각 시험마다 평균 계산
		   double mean;	// 평균점수
		   double[] meanArray;
		   
		   n = input.nextInt();	// 점수 개수 (학생 수)
		   meanArray = new double[n];
		   mean = 0;
		   
		   for(int j=0; j<n; j++) {
			   meanArray[j] = input.nextInt();
			   mean += meanArray[j];	// 일단 학생들 점수 다 합치고
		   }
		   mean = mean / n;	// 평균
		   
		   meanOverArray[i] = 0;
		   for(int j=0; j<n; j++) {
			   if(meanArray[j] > mean) {	// 넘으면 = 초과 O, 이상 X
				 meanOverArray[i] ++;  
			   }
		   }
		   meanOverArray[i] = meanOverArray[i] /n *100;
	   }
	   
	   // 각 class별로 평균 출력
	   for(int i=0; i<testCase; i++) {
		   System.out.printf("%.3f", meanOverArray[i]);
		   System.out.print("% \n");
	   }
	}
}